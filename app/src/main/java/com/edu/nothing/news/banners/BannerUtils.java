package com.edu.nothing.news.banners;

import android.content.Context;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

/**
 * Created by Mirko Dimartino on 28/10/24.
 */
public class BannerUtils {
    public static Optional<String> loadLocalBanners(Context context, String fileName) {
        try (InputStreamReader inputStreamReader = new InputStreamReader(
                context.getAssets().open(fileName), StandardCharsets.UTF_8);
             BufferedReader reader = new BufferedReader(inputStreamReader)) {

            StringBuilder builder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }
            return Optional.of(builder.toString());
        } catch (IOException exception) {
            return Optional.empty();
        }
    }

}
