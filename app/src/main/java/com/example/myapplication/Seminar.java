package com.example.myapplication;

public class Seminar {
    private String title;
    private String type;
    private String coverImage;
    private String songURL;

    public Seminar(){}

    public Seminar(String title, String type, String coverImage, String songURL){
        this.title = title;
        this.type = type;
        this.coverImage = coverImage;
        this.songURL = songURL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public String getSongURL() {
        return songURL;
    }

    public void setSongURL(String songURL) {
        this.songURL = songURL;
    }
}
