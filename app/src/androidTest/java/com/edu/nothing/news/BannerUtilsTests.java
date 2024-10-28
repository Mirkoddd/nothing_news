package com.edu.nothing.news;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import android.content.Context;

import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.edu.nothing.news.banners.BannerUtils;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Optional;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class BannerUtilsTests {

    private Context context;

    @Before
    public void setUp() {
        context = ApplicationProvider.getApplicationContext();
    }

    @Test
    public void loadLocalBanners_ShouldReturnContent_WhenFileExists() {
        // Given file name
        String fileName = "banners.json";
        Optional<String> result = BannerUtils.loadLocalBanners(context, fileName);

        // expected result
        boolean isPresent = result.isPresent();

        // check that the content is present
        assertTrue(isPresent);
    }

    @Test
    public void loadLocalBanners_ShouldReturnJSON_WhenFileExists() {
        // Given file name
        String fileName = "banners.json";

        // expected result
        String expectedJSON = "[  {    \"type\": \"banners\",    \"id\": \"75\",    \"attributes\": {      \"title\": \"Community Edition - Get ready for the reveal\",      \"image\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-10-15/1728980705-579199-1500x1060-large.jpg\",      \"imageMob\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-10-15/1728980705-700493-1798x448-large.jpg\",      \"link\": \"https://nothing.community/d/18382-community-edition-get-ready-for-the-reveal\",      \"btnText\": \"Read More\"    }  },  {    \"type\": \"banners\",    \"id\": \"74\",    \"attributes\": {      \"title\": \"Inside Ear (open) - Teardown & Giveaway\",      \"image\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-10-14/1728905599-842503-flaaffyteardown.png\",      \"imageMob\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-10-14/1728905476-270092-flaaffyteardownsmall.png\",      \"link\": \"https://nothing.community/d/17454-inside-ear-open\",      \"btnText\": \"Read More\"    }  },  {    \"type\": \"banners\",    \"id\": \"73\",    \"attributes\": {      \"title\": \"Nothing OS 3.0 - Open Beta 1 for Phone (2a)\",      \"image\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-10-08/1728374662-256138-nos-community-1798x448-nocopy.png\",      \"imageMob\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-10-08/1728374663-65446-nos-community-1500x1060-nocopy.png\",      \"link\": \"https://nothing.community/d/17516-nothing-os-30-open-beta-1\",      \"btnText\": \"Learn More\"    }  },  {    \"type\": \"banners\",    \"id\": \"72\",    \"attributes\": {      \"title\": \"Introducing Ear (open)\",      \"image\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-09-24/1727177754-648514-community-1798x448.png\",      \"imageMob\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-09-24/1727169337-319932-not-flaaffy-stills-01-v02-00000-blue-16x9.jpg\",      \"link\": \"https://nothing.community/d/16697-introducing-ear-open\",      \"btnText\": \"Read More\"    }  },  {    \"type\": \"banners\",    \"id\": \"69\",    \"attributes\": {      \"title\": \"Extra power, extra pixels, extra unique.\",      \"image\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-08-01/1722504679-80455-aeroplusbig.png\",      \"imageMob\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-08-01/1722504679-489058-aeroplusmob.png\",      \"link\": \"https://nothing.community/d/13842-extra-power-extra-pixels-extra-unique-phone-2a-plus\",      \"btnText\": \"Read More\"    }  }]";
        Optional<String> result = BannerUtils.loadLocalBanners(context, fileName);


        assertTrue(result.isPresent());
        assertEquals(expectedJSON, result.get());
    }

    @Test
    public void loadLocalBanners_ShouldReturnEmpty_WhenFileNotFound() {
        // Given file name, purposely wrong
        String fileNameThatDoesNotExists = "banner.json";
        Optional<String> result = BannerUtils.loadLocalBanners(context, fileNameThatDoesNotExists);

        // check that result is empty
        assertFalse(result.isPresent());
    }
}