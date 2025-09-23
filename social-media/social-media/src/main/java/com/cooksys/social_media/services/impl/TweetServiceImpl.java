package com.cooksys.social_media.services.impl;

import com.cooksys.social_media.dtos.*;
import com.cooksys.social_media.exceptions.NotFoundException;
import com.cooksys.social_media.mappers.HashtagMapper;
import com.cooksys.social_media.mappers.TweetMapper;
import com.cooksys.social_media.mappers.UserMapper;
import com.cooksys.social_media.respositories.HashTagRepository;
import com.cooksys.social_media.respositories.TweetRepository;
import com.cooksys.social_media.respositories.UserRepository;
import com.cooksys.social_media.services.TweetService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TweetServiceImpl implements TweetService {

    private final TweetRepository tweetRepository;
    private final UserRepository userRepository;
    private final HashTagRepository hashTagRepository;
    private final TweetMapper tweetMapper;
    private final UserMapper userMapper;
    private final HashtagMapper hashtagMapper;

    @Override
    public List<TweetResponseDto> getTweets() {
        return tweetMapper.entitiesToDtos(tweetRepository.findAllByDeletedFalse());
    }

    @Override
    public TweetResponseDto postTweet(TweetRequestDto tweetRequestDto) {
        return null;
    }

    @Override
    public TweetResponseDto getTweetById(Long id) {
        if (!tweetRepository.existsById(id) || tweetRepository.findById(id).get().isDeleted()) {
            throw new NotFoundException("Tweet not found");
        }
        return tweetMapper.entityToDto(tweetRepository.findById(id).get());
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
    public List<HashtagDto> getTagsByTweetId(Long id) {
        return null;
    }

    @Override
    public ContextDto getContextByTweetId(Long id) {
        return null;
    }

    @Override
    public List<UserResponseDto> getLikesByTweetId(Long id) {
        return null;
    }

    @Override
    public List<TweetResponseDto> getRepliesByTweetId() {
        return null;
    }

    @Override
    public List<TweetResponseDto> getRepostsByTweetId() {
        return null;
    }

    @Override
    public List<UserResponseDto> getMentionsByTweetId() {
        return null;
    }

    @Override
    public TweetResponseDto repostTweetById(Long id, CredentialsDto credentialsDto) {
        return null;
    }
}
