package com.edu.nothing.news.news;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by Mirko Dimartino on 04/11/24.
 */
public class NewsTest {

    @Test
    public void constructor_test(){
        // Given
        String fakeTitle = "Fake Title";
        String fakeImage = "Fake Image";
        String fakeLink = "Fake Link";

        NewsAttributes newsAttributes = new NewsAttributes(
                fakeTitle,
                fakeImage,
                fakeLink
        );

        String newsId = "1";
        News news = new News(newsId, newsAttributes);
        // expected
        String expectedNewsId = "1";
        String expectedTitle = "Fake Title";
        String expectedImage = "Fake Image";
        String expectedLink = "Fake Link";

        // check
        assertEquals(expectedNewsId, news.getNewsId());
        assertEquals(expectedTitle, news.getNewsAttributes().getNewsTitle());
        assertEquals(expectedImage, news.getNewsAttributes().getNewsImage());
        assertEquals(expectedLink, news.getNewsAttributes().getNewsLink());
    }
}
