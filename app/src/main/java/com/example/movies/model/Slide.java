package com.example.movies.model;

public class Slide {
    String titleFilm;
    int imgSidle;

    public Slide(String titleFilm, int imgSidle) {
        this.titleFilm = titleFilm;
        this.imgSidle = imgSidle;
    }

    public String getTitleFilm() {
        return titleFilm;
    }

    public void setTitleFilm(String titleFilm) {
        this.titleFilm = titleFilm;
    }

    public int getImgSidle() {
        return imgSidle;
    }

    public void setImgSidle(int imgSidle) {
        this.imgSidle = imgSidle;
    }
}
