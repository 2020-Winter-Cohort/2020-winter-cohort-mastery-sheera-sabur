package com.survivingcodingbootcamp.blog.integration;

import com.survivingcodingbootcamp.blog.controller.HashtagController;
import com.survivingcodingbootcamp.blog.controller.TopicController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class BlogApplicationSmokeTests {
    @Autowired
    private HashtagController hashtagController;
    @Autowired
    private TopicStorage topicStorage;
    @Autowired
    private TopicController topicController;
    @Autowired
    private PostStorage postStorage;

    @Test
    void contextLoads() {
    }

    @Test
    void beanCreation() {
        assertNotNull(hashtagController);
        assertNotNull(topicStorage);
        assertNotNull(topicController);
        assertNotNull(postStorage);

    }
}
