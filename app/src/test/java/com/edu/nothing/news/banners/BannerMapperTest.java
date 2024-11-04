package com.edu.nothing.news.banners;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by Mirko Dimartino on 28/10/24.
 */
public class BannerMapperTest {
    @Test
    public void jsonToBannerList_ShouldReturnBannerList_WhenJSONIsCorrect() {
        // Given
        String givenJSON = "[  {    \"type\": \"banners\",    \"id\": \"75\",    \"attributes\": {      \"title\": \"Community Edition - Get ready for the reveal\",      \"image\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-10-15/1728980705-579199-1500x1060-large.jpg\",      \"imageMob\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-10-15/1728980705-700493-1798x448-large.jpg\",      \"link\": \"https://nothing.community/d/18382-community-edition-get-ready-for-the-reveal\",      \"btnText\": \"Read More\"    }  },  {    \"type\": \"banners\",    \"id\": \"74\",    \"attributes\": {      \"title\": \"Inside Ear (open) - Teardown & Giveaway\",      \"image\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-10-14/1728905599-842503-flaaffyteardown.png\",      \"imageMob\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-10-14/1728905476-270092-flaaffyteardownsmall.png\",      \"link\": \"https://nothing.community/d/17454-inside-ear-open\",      \"btnText\": \"Read More\"    }  },  {    \"type\": \"banners\",    \"id\": \"73\",    \"attributes\": {      \"title\": \"Nothing OS 3.0 - Open Beta 1 for Phone (2a)\",      \"image\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-10-08/1728374662-256138-nos-community-1798x448-nocopy.png\",      \"imageMob\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-10-08/1728374663-65446-nos-community-1500x1060-nocopy.png\",      \"link\": \"https://nothing.community/d/17516-nothing-os-30-open-beta-1\",      \"btnText\": \"Learn More\"    }  },  {    \"type\": \"banners\",    \"id\": \"72\",    \"attributes\": {      \"title\": \"Introducing Ear (open)\",      \"image\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-09-24/1727177754-648514-community-1798x448.png\",      \"imageMob\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-09-24/1727169337-319932-not-flaaffy-stills-01-v02-00000-blue-16x9.jpg\",      \"link\": \"https://nothing.community/d/16697-introducing-ear-open\",      \"btnText\": \"Read More\"    }  },  {    \"type\": \"banners\",    \"id\": \"69\",    \"attributes\": {      \"title\": \"Extra power, extra pixels, extra unique.\",      \"image\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-08-01/1722504679-80455-aeroplusbig.png\",      \"imageMob\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-08-01/1722504679-489058-aeroplusmob.png\",      \"link\": \"https://nothing.community/d/13842-extra-power-extra-pixels-extra-unique-phone-2a-plus\",      \"btnText\": \"Read More\"    }  }]";

        List<Banner> banners = BannerMapper.jsonToBannerList(givenJSON);

        // expected
        boolean isEmpty = banners.isEmpty();

        // check that the list is not empty
        assertFalse(isEmpty);
    }

    @Test
    public void jsonToBannerList_ShouldReturnEmpty_WhenJSONIsNotCorrect() {
        // Given
        String givenJSON = null;

        List<Banner> banners = BannerMapper.jsonToBannerList(givenJSON);

        // expected
        boolean isEmpty = banners.isEmpty();

        // check that the list is empty
        assertTrue(isEmpty);
    }

    @Test
    public void jsonToBannerList_ShouldReturnBannerListIds_WhenJSONIsCorrect() {
        // Given
        String givenJSON = "[  {    \"type\": \"banners\",    \"id\": \"75\",    \"attributes\": {      \"title\": \"Community Edition - Get ready for the reveal\",      \"image\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-10-15/1728980705-579199-1500x1060-large.jpg\",      \"imageMob\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-10-15/1728980705-700493-1798x448-large.jpg\",      \"link\": \"https://nothing.community/d/18382-community-edition-get-ready-for-the-reveal\",      \"btnText\": \"Read More\"    }  },  {    \"type\": \"banners\",    \"id\": \"74\",    \"attributes\": {      \"title\": \"Inside Ear (open) - Teardown & Giveaway\",      \"image\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-10-14/1728905599-842503-flaaffyteardown.png\",      \"imageMob\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-10-14/1728905476-270092-flaaffyteardownsmall.png\",      \"link\": \"https://nothing.community/d/17454-inside-ear-open\",      \"btnText\": \"Read More\"    }  },  {    \"type\": \"banners\",    \"id\": \"73\",    \"attributes\": {      \"title\": \"Nothing OS 3.0 - Open Beta 1 for Phone (2a)\",      \"image\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-10-08/1728374662-256138-nos-community-1798x448-nocopy.png\",      \"imageMob\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-10-08/1728374663-65446-nos-community-1500x1060-nocopy.png\",      \"link\": \"https://nothing.community/d/17516-nothing-os-30-open-beta-1\",      \"btnText\": \"Learn More\"    }  },  {    \"type\": \"banners\",    \"id\": \"72\",    \"attributes\": {      \"title\": \"Introducing Ear (open)\",      \"image\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-09-24/1727177754-648514-community-1798x448.png\",      \"imageMob\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-09-24/1727169337-319932-not-flaaffy-stills-01-v02-00000-blue-16x9.jpg\",      \"link\": \"https://nothing.community/d/16697-introducing-ear-open\",      \"btnText\": \"Read More\"    }  },  {    \"type\": \"banners\",    \"id\": \"69\",    \"attributes\": {      \"title\": \"Extra power, extra pixels, extra unique.\",      \"image\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-08-01/1722504679-80455-aeroplusbig.png\",      \"imageMob\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-08-01/1722504679-489058-aeroplusmob.png\",      \"link\": \"https://nothing.community/d/13842-extra-power-extra-pixels-extra-unique-phone-2a-plus\",      \"btnText\": \"Read More\"    }  }]";

        List<Banner> banners = BannerMapper.jsonToBannerList(givenJSON);
        List<String> bannerIds = banners.stream()
                .map(Banner::getBannerId)
                .collect(Collectors.toList());

        // expected
        List<String> expectedIds = new ArrayList<>();
        expectedIds.add("75");
        expectedIds.add("74");
        expectedIds.add("73");
        expectedIds.add("72");
        expectedIds.add("69");

        boolean contentIsEqual = bannerIds.equals(expectedIds);

        // check that the list of ids is as expected
        assertTrue(contentIsEqual);
    }

    @Test
    public void jsonToBannerList_CheckFirstBannerAttributes_WhenJSONIsCorrect() {
        // Given
        String givenJSON = "[  {    \"type\": \"banners\",    \"id\": \"75\",    \"attributes\": {      \"title\": \"Community Edition - Get ready for the reveal\",      \"image\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-10-15/1728980705-579199-1500x1060-large.jpg\",      \"imageMob\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-10-15/1728980705-700493-1798x448-large.jpg\",      \"link\": \"https://nothing.community/d/18382-community-edition-get-ready-for-the-reveal\",      \"btnText\": \"Read More\"    }  },  {    \"type\": \"banners\",    \"id\": \"74\",    \"attributes\": {      \"title\": \"Inside Ear (open) - Teardown & Giveaway\",      \"image\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-10-14/1728905599-842503-flaaffyteardown.png\",      \"imageMob\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-10-14/1728905476-270092-flaaffyteardownsmall.png\",      \"link\": \"https://nothing.community/d/17454-inside-ear-open\",      \"btnText\": \"Read More\"    }  },  {    \"type\": \"banners\",    \"id\": \"73\",    \"attributes\": {      \"title\": \"Nothing OS 3.0 - Open Beta 1 for Phone (2a)\",      \"image\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-10-08/1728374662-256138-nos-community-1798x448-nocopy.png\",      \"imageMob\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-10-08/1728374663-65446-nos-community-1500x1060-nocopy.png\",      \"link\": \"https://nothing.community/d/17516-nothing-os-30-open-beta-1\",      \"btnText\": \"Learn More\"    }  },  {    \"type\": \"banners\",    \"id\": \"72\",    \"attributes\": {      \"title\": \"Introducing Ear (open)\",      \"image\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-09-24/1727177754-648514-community-1798x448.png\",      \"imageMob\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-09-24/1727169337-319932-not-flaaffy-stills-01-v02-00000-blue-16x9.jpg\",      \"link\": \"https://nothing.community/d/16697-introducing-ear-open\",      \"btnText\": \"Read More\"    }  },  {    \"type\": \"banners\",    \"id\": \"69\",    \"attributes\": {      \"title\": \"Extra power, extra pixels, extra unique.\",      \"image\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-08-01/1722504679-80455-aeroplusbig.png\",      \"imageMob\": \"https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-08-01/1722504679-489058-aeroplusmob.png\",      \"link\": \"https://nothing.community/d/13842-extra-power-extra-pixels-extra-unique-phone-2a-plus\",      \"btnText\": \"Read More\"    }  }]";

        List<Banner> banners = BannerMapper.jsonToBannerList(givenJSON);
        Optional<Banner> firstBanner = banners.stream().findFirst();

        // expected
        boolean isPresent = firstBanner.isPresent();
        String expectedTitle = "Community Edition - Get ready for the reveal";
        String expectedImage = "https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-10-15/1728980705-579199-1500x1060-large.jpg";
        String expectedMobileImage = "https://s3-nothing-prod.s3.eu-central-1.amazonaws.com/2024-10-15/1728980705-700493-1798x448-large.jpg";
        String expectedLink = "https://nothing.community/d/18382-community-edition-get-ready-for-the-reveal";
        String expectedButtonText = "Read More";

        assertTrue(isPresent);

        BannerAttributes bannerAttributes = firstBanner.get().getBannerAttributes();

        assertEquals(expectedTitle, bannerAttributes.getBannerTitle());
        assertEquals(expectedImage, bannerAttributes.getBannerImage());
        assertEquals(expectedMobileImage, bannerAttributes.getBannerImageMobile());
        assertEquals(expectedLink, bannerAttributes.getBannerLink());
        assertEquals(expectedButtonText, bannerAttributes.getBannerButtonText());
    }

}