package com.cooksys.social_media.services;

import com.cooksys.social_media.dtos.*;

public interface TweetService {
    TweetResponseDto getTweets();

    TweetResponseDto postTweet(TweetRequestDto tweetRequestDto);

    TweetResponseDto getTweetById();

    TweetResponseDto deleteTweetById(CredentialsDto credentialsDto);

    void likeTweetById(CredentialsDto credentialsDto);

    TweetResponseDto replyToTweetById(TweetRequestDto tweetRequestDto);

    HashtagDto getTagsByTweetId();

    ContextDto getContextByTweetId();

    UserResponseDto getLikesByTweetId();

    TweetResponseDto getRepliesByTweetId();

    TweetResponseDto getRepostsByTweetId();

    UserResponseDto getMentionsByTweetId();

    TweetResponseDto repostTweetById(CredentialsDto credentialsDto);
}
