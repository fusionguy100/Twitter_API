package com.cooksys.social_media.services.impl;

import com.cooksys.social_media.dtos.CredentialsDto;
import com.cooksys.social_media.dtos.TweetResponseDto;
import com.cooksys.social_media.dtos.UserRequestDto;
import com.cooksys.social_media.dtos.UserResponseDto;
import com.cooksys.social_media.respositories.UserRepository;
import com.cooksys.social_media.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<UserResponseDto> getAllUsers() {
        return List.of();
    }

    @Override
    public UserResponseDto createUser(UserRequestDto userRequestDto) {
        return null;
    }

    @Override
    public UserResponseDto getUserByUsername() {
        return null;
    }

    @Override
    public UserResponseDto deleteUserByUsername(CredentialsDto credentialsDto) {
        return null;
    }

    @Override
    public UserResponseDto updateUserByUsername(UserRequestDto userRequestDto) {
        return null;
    }

    @Override
    public void followUser(CredentialsDto credentialsDto) {

    }

    @Override
    public void unfollowUser() {

    }

    @Override
    public TweetResponseDto getUserFeed() {
        return null;
    }

    @Override
    public TweetResponseDto getUserTweets() {
        return null;
    }

    @Override
    public TweetResponseDto getUserMentions() {
        return null;
    }

    @Override
    public UserResponseDto getUserFollowers() {
        return null;
    }

    @Override
    public UserResponseDto getUserFollowing() {
        return null;
    }
}
