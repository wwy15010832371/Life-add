package com.example.administrator.u2_project.db;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Administrator on 2017/6/5.
 */

public class Look_eHttp {
    private static Handler handler = new Handler(Looper.getMainLooper());
    public static void getLook_eHttp(final String path, final IHttpGetData iHttpGetData){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    URL url = new URL(path);
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("GET");
                    int responseCode = connection.getResponseCode();
                    if (responseCode==200){
                        InputStream inputStream = connection.getInputStream();
                        BufferedInputStream bf = new BufferedInputStream(inputStream);
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        int line = 0;
                        byte[] bytes = new byte[1024];
                        while ((line=bf.read(bytes))!=-1){
                            stream.write(bytes,0,line);
                        }
                        final byte[] bytes1 = stream.toByteArray();
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                iHttpGetData.onSuccess(bytes1);
                            }
                        });

                    }
                } catch (final MalformedURLException e) {
                    e.printStackTrace();
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            iHttpGetData.onError(e.getMessage());

                        }
                    });
                } catch (final IOException e) {
                    e.printStackTrace();
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            Log.d("TAG", "run:99999 ");
                            iHttpGetData.onError(e.getMessage());
                        }
                    });
                }

            }
        }).start();
    }
    public interface IHttpGetData {
        //成功
        void onSuccess(byte[] data);
        //失败
        void onError(String error);  }
}
