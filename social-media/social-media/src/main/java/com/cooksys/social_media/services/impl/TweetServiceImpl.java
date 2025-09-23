package com.cooksys.social_media.services.impl;

import com.cooksys.social_media.services.TweetService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TweetServiceImpl implements TweetService {
    @Override
    public String getTweets() {
        return "";
    }

    @Override
    public String postTweet() {
        return "";
    }

    @Override
    public String getTweetById() {
        return "";
    }

    @Override
    public String deleteTweetById() {
        return "";
    }

    @Override
    public String likeTweetById() {
        return "";
    }

    @Override
    public String replyToTweetById() {
        return "";
    }

    @Override
    public String getTagsByTweetId() {
        return "";
    }

    @Override
    public String getContextByTweetId() {
        return "";
    }

    @Override
    public String getLikesByTweetId() {
        return "";
    }

    @Override
    public String getRepliesByTweetId() {
        return "";
    }

    @Override
    public String getRepostsByTweetId() {
        return "";
    }

    @Override
    public String getMentionsByTweetId() {
        return "";
    }
}
