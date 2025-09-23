package com.cooksys.social_media.services.impl;

import com.cooksys.social_media.dtos.*;
import com.cooksys.social_media.services.TweetService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TweetServiceImpl implements TweetService {

    @Override
    public TweetResponseDto getTweets() {
        return null;
    }

    @Override
    public TweetResponseDto postTweet(TweetRequestDto tweetRequestDto) {
        return null;
    }

    @Override
    public TweetResponseDto getTweetById() {
        return null;
    }

    @Override
    public TweetResponseDto deleteTweetById(CredentialsDto credentialsDto) {
        return null;
    }

    @Override
    public void likeTweetById(CredentialsDto credentialsDto) {

    }

    @Override
    public TweetResponseDto replyToTweetById(TweetRequestDto tweetRequestDto) {
        return null;
    }

    @Override
    public HashtagDto getTagsByTweetId() {
        return null;
    }

    @Override
    public ContextDto getContextByTweetId() {
        return null;
    }

    @Override
    public UserResponseDto getLikesByTweetId() {
        return null;
    }

    @Override
    public TweetResponseDto getRepliesByTweetId() {
        return null;
    }

    @Override
    public TweetResponseDto getRepostsByTweetId() {
        return null;
    }

    @Override
    public UserResponseDto getMentionsByTweetId() {
        return null;
    }

    @Override
    public TweetResponseDto repostTweetById(CredentialsDto credentialsDto) {
        return null;
    }
}
