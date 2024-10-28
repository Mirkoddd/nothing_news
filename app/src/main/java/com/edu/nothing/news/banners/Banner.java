package com.edu.nothing.news.banners;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Mirko Dimartino on 28/10/24.
 */
public class Banner implements Serializable {
    @SerializedName("id")
    private final String bannerId;
    @SerializedName("attributes")
    private final BannerAttributes bannerAttributes;

    public Banner(String bannerId, BannerAttributes bannerAttributes) {
        this.bannerId = bannerId;
        this.bannerAttributes = bannerAttributes;
    }

    public String getBannerId() {
        return bannerId;
    }

    public BannerAttributes getBannerAttributes() {
        return bannerAttributes;
    }
}
