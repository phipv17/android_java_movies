package com.example.movies;

import android.widget.ImageView;

import com.example.movies.model.Popular;

public interface ICLickPopularItem {

    void onClickPopularItem(Popular popular, ImageView imageView);
}
