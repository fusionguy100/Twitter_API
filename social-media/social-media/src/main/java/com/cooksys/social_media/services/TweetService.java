package com.cooksys.social_media.services;

public interface TweetService {
    String getTweets();

    String postTweet();

    String getTweetById();

    String deleteTweetById();

    String likeTweetById();

    String replyToTweetById();

    String getTagsByTweetId();

    String getContextByTweetId();

    String getLikesByTweetId();

    String getRepliesByTweetId();

    String getRepostsByTweetId();

    String getMentionsByTweetId();
}
