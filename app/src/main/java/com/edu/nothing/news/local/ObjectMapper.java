package com.edu.nothing.news.local;

import com.edu.nothing.news.banners.Banner;
import com.edu.nothing.news.news.News;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

/**
 * Created by Mirko Dimartino on 04/11/24.
 */
public class ObjectMapper {
    public static List<Banner> jsonToBannerList(String json) {
        if (json == null || json.isEmpty()) return Collections.emptyList();

        Gson gson = new Gson();
        Type bannerListType = new TypeToken<List<Banner>>() {}.getType();
        return gson.fromJson(json, bannerListType);
    }

    public static List<News> jsonToNewsList(String json) {
        if (json == null || json.isEmpty()) return Collections.emptyList();

        Gson gson = new Gson();
        Type newsListType = new TypeToken<List<News>>() {}.getType();
        return gson.fromJson(json, newsListType);
    }
}
