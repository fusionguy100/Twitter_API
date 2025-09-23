package com.cooksys.social_media.services;

import com.cooksys.social_media.dtos.*;

public interface TweetService {
    TweetResponseDto getTweets();

    TweetResponseDto postTweet(TweetRequestDto tweetRequestDto);

    TweetResponseDto getTweetById(Long id);

    TweetResponseDto deleteTweetById(Long id, CredentialsDto credentialsDto);

    void likeTweetById(Long id, CredentialsDto credentialsDto);

    TweetResponseDto replyToTweetById(Long id, TweetRequestDto tweetRequestDto);

    HashtagDto getTagsByTweetId(Long id);

    ContextDto getContextByTweetId(Long id);

    UserResponseDto getLikesByTweetId(Long id);

    TweetResponseDto getRepliesByTweetId();

    TweetResponseDto getRepostsByTweetId();

    UserResponseDto getMentionsByTweetId();

    TweetResponseDto repostTweetById(Long id, CredentialsDto credentialsDto);
}
