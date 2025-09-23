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
    public TweetResponseDto getTweetById(Long id) {
        return null;
    }

    @Override
    public TweetResponseDto deleteTweetById(Long id, CredentialsDto credentialsDto) {
        return null;
    }

    @Override
    public void likeTweetById(Long id, CredentialsDto credentialsDto) {

    }

    @Override
    public TweetResponseDto replyToTweetById(Long id, TweetRequestDto tweetRequestDto) {
        return null;
    }

    @Override
    public HashtagDto getTagsByTweetId(Long id) {
        return null;
    }

    @Override
    public ContextDto getContextByTweetId(Long id) {
        return null;
    }

    @Override
    public UserResponseDto getLikesByTweetId(Long id) {
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
    public TweetResponseDto repostTweetById(Long id, CredentialsDto credentialsDto) {
        return null;
    }
}
