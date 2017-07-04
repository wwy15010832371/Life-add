package com.example.administrator.u2_project.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2017/6/5.
 */

public class Look_e {
    private String pic;
    private String name;
    private String artist;
    private String playcnt;
    private List<ListBean> list;

    public Look_e() {
    }

    public Look_e(String name, String artist, String playcnt) {
        this.name = name;
        this.artist = artist;
        this.playcnt = playcnt;
    }

    public Look_e(String pic, String name, String artist, String playcnt) {
        this.pic = pic;
        this.name = name;
        this.artist = artist;
        this.playcnt = playcnt;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getPlaycnt() {
        return playcnt;
    }

    public void setPlaycnt(String playcnt) {
        this.playcnt = playcnt;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }


    public static class NavBean {
        /**
         * hasmore : 0
         * curpage : 1
         * id : 10000048
         * restype : duoduo
         * name : 多多儿歌
         * method : 15
         * pic : http://bbhlt.shoujiduoduo.com/bb/video/pic/10000048.jpg
         */

        private int hasmore;
        private int curpage;
        private int id;
        private String restype;
        @SerializedName("name")
        private String nameX;
        private int method;
        @SerializedName("pic")
        private String picX;

        public int getHasmore() {
            return hasmore;
        }

        public void setHasmore(int hasmore) {
            this.hasmore = hasmore;
        }

        public int getCurpage() {
            return curpage;
        }

        public void setCurpage(int curpage) {
            this.curpage = curpage;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getRestype() {
            return restype;
        }

        public void setRestype(String restype) {
            this.restype = restype;
        }

        public String getNameX() {
            return nameX;
        }

        public void setNameX(String nameX) {
            this.nameX = nameX;
        }

        public int getMethod() {
            return method;
        }

        public void setMethod(int method) {
            this.method = method;
        }

        public String getPicX() {
            return picX;
        }

        public void setPicX(String picX) {
            this.picX = picX;
        }
    }

    public static class ListBean {
        /**
         * hasmore : 1
         * curpage : 1
         * area :
         * id : 343673448
         * restype : duoduo
         * filesize : 10871428
         * duration : 169.64
         * method : 16
         * downurl : http://cdnbbbd.shoujiduoduo.com/bb/video/10000048/343673448v4.mp4
         * pic : http://cdnbbvfw.shoujiduoduo.com/bb/video/pic/343673448.jpg
         * playcnt : 165636571
         * ismusic : 4
         * name : 小苹果
         * artist : 多多儿歌
         * cateid : 15
         */

        private int hasmore;
        private int curpage;
        private String area;
        private String id;
        private String restype;
        private int filesize;
        private double duration;
        private int method;
        private String downurl;
        @SerializedName("pic")
        private String picX;
        @SerializedName("playcnt")
        private int playcntX;
        private int ismusic;
        @SerializedName("name")
        private String nameX;
        @SerializedName("artist")
        private String artistX;
        private int cateid;

        public int getHasmore() {
            return hasmore;
        }

        public void setHasmore(int hasmore) {
            this.hasmore = hasmore;
        }

        public int getCurpage() {
            return curpage;
        }

        public void setCurpage(int curpage) {
            this.curpage = curpage;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getRestype() {
            return restype;
        }

        public void setRestype(String restype) {
            this.restype = restype;
        }

        public int getFilesize() {
            return filesize;
        }

        public void setFilesize(int filesize) {
            this.filesize = filesize;
        }

        public double getDuration() {
            return duration;
        }

        public void setDuration(double duration) {
            this.duration = duration;
        }

        public int getMethod() {
            return method;
        }

        public void setMethod(int method) {
            this.method = method;
        }

        public String getDownurl() {
            return downurl;
        }

        public void setDownurl(String downurl) {
            this.downurl = downurl;
        }

        public String getPicX() {
            return picX;
        }

        public void setPicX(String picX) {
            this.picX = picX;
        }

        public int getPlaycntX() {
            return playcntX;
        }

        public void setPlaycntX(int playcntX) {
            this.playcntX = playcntX;
        }

        public int getIsmusic() {
            return ismusic;
        }

        public void setIsmusic(int ismusic) {
            this.ismusic = ismusic;
        }

        public String getNameX() {
            return nameX;
        }

        public void setNameX(String nameX) {
            this.nameX = nameX;
        }

        public String getArtistX() {
            return artistX;
        }

        public void setArtistX(String artistX) {
            this.artistX = artistX;
        }

        public int getCateid() {
            return cateid;
        }

        public void setCateid(int cateid) {
            this.cateid = cateid;
        }
    }
}
