package com.edu.nothing.news.banners;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

/**
 * Created by Mirko Dimartino on 28/10/24.
 */
public class BannerMapper {
    public static List<Banner> jsonToBannerList(String json){
        if (json == null || json.isEmpty()) return Collections.emptyList();

        Gson gson = new Gson();
        Type bannerListType = new TypeToken<List<Banner>>(){}.getType();
        return gson.fromJson(json, bannerListType);
    }
}
