package com.cooksys.social_media.services;

import com.cooksys.social_media.dtos.CredentialsDto;
import com.cooksys.social_media.dtos.TweetResponseDto;
import com.cooksys.social_media.dtos.UserRequestDto;
import com.cooksys.social_media.dtos.UserResponseDto;

import java.util.List;

public interface UserService {
    List<UserResponseDto> getAllUsers();

    UserResponseDto createUser(UserRequestDto userRequestDto);

    UserResponseDto getUserByUsername();

    UserResponseDto deleteUserByUsername(CredentialsDto credentialsDto);

    UserResponseDto updateUserByUsername(UserRequestDto userRequestDto);

    void followUser(CredentialsDto credentialsDto);

    void unfollowUser();

    TweetResponseDto getUserFeed();

    TweetResponseDto getUserTweets();

    TweetResponseDto getUserMentions();

    UserResponseDto getUserFollowers();

    UserResponseDto getUserFollowing();
}
