package com.example.a1.fragment_one.anime_adapter;

import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;

public class Anime implements Serializable {
    private String imgPoster;
    private String tvName;

    public Anime(String imgPoster, String tvName) {
        this.imgPoster = String.valueOf(imgPoster);
        this.tvName = String.valueOf(tvName);
    }

    public String getImgPoster() {
        return imgPoster;
    }

    public void setImgPoster(ImageView imgPoster) {
        this.imgPoster = String.valueOf(imgPoster);
    }

    public String getTvName() {
        return tvName;
    }

    public void setTvName(TextView tvName) {
        this.tvName = String.valueOf(tvName);
    }
}
