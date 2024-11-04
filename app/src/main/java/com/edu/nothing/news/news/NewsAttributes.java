package com.edu.nothing.news.news;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Mirko Dimartino on 04/11/24.
 */
public class NewsAttributes implements Serializable {
    @SerializedName("title")
    private final String newsTitle;
    @SerializedName("imageUrl")
    private final String newsImage;
    @SerializedName("link")
    private final String newsLink;

    public NewsAttributes(String newsTitle, String newsImage, String newsLink) {
        this.newsTitle = newsTitle;
        this.newsImage = newsImage;
        this.newsLink = newsLink;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public String getNewsImage() {
        return newsImage;
    }

    public String getNewsLink() {
        return newsLink;
    }
}
