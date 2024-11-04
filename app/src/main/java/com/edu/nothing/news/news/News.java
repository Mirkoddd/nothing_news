package com.edu.nothing.news.news;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Mirko Dimartino on 04/11/24.
 */
public class News implements Serializable {
    @SerializedName("id")
    private final String newsId;
    @SerializedName("attributes")
    private final NewsAttributes newsAttributes;

    public News(String newsId, NewsAttributes newsAttributes) {
        this.newsId = newsId;
        this.newsAttributes = newsAttributes;
    }

    public String getNewsId() {
        return newsId;
    }

    public NewsAttributes getNewsAttributes() {
        return newsAttributes;
    }
}
