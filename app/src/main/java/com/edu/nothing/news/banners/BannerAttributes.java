package com.edu.nothing.news.banners;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Mirko Dimartino on 28/10/24.
 */
public class BannerAttributes implements Serializable {
    @SerializedName("title")
    private final String bannerTitle;
    @SerializedName("image")
    private final String bannerImage;
    @SerializedName("imageMob")
    private final String bannerImageMobile;
    @SerializedName("link")
    private final String bannerLink;
    @SerializedName("btnText")
    private final String bannerButtonText;

    public BannerAttributes(String bannerTitle,
                            String bannerImage,
                            String bannerImageMobile,
                            String bannerLink,
                            String bannerButtonText
    ) {
        this.bannerTitle = bannerTitle;
        this.bannerImage = bannerImage;
        this.bannerImageMobile = bannerImageMobile;
        this.bannerLink = bannerLink;
        this.bannerButtonText = bannerButtonText;
    }

    public String getBannerTitle() {
        return bannerTitle;
    }

    public String getBannerImage() {
        return bannerImage;
    }

    public String getBannerImageMobile() {
        return bannerImageMobile;
    }

    public String getBannerLink() {
        return bannerLink;
    }

    public String getBannerButtonText() {
        return bannerButtonText;
    }
}
