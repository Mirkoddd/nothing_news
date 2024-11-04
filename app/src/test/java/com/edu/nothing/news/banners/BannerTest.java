package com.edu.nothing.news.banners;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by Mirko Dimartino on 04/11/24.
 */
public class BannerTest {

    @Test
    public void constructor_test(){
        // Given
        String fakeTitle = "Fake Title";
        String fakeImage = "Fake Image";
        String fakeMobileImage = "Fake Mobile Image";
        String fakeLink = "Fake Link";
        String fakeButtonText = "Fake Button Text";

        BannerAttributes bannerAttributes = new BannerAttributes(
                fakeTitle,
                fakeImage,
                fakeMobileImage,
                fakeLink,
                fakeButtonText
        );

        String bannerId = "1";
        Banner banner = new Banner(bannerId, bannerAttributes);
        // expected
        String expectedBannerId = "1";
        String expectedTitle = "Fake Title";

        // check
        assertEquals(expectedBannerId, banner.getBannerId());
        assertEquals(expectedTitle, bannerAttributes.getBannerTitle());
    }
}
