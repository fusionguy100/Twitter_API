package com.cooksys.social_media.services.impl;

import com.cooksys.social_media.dtos.*;
import com.cooksys.social_media.entities.User;
import com.cooksys.social_media.exceptions.BadRequestException;
import com.cooksys.social_media.mappers.ProfileMapper;
import com.cooksys.social_media.mappers.UserMapper;
import com.cooksys.social_media.respositories.UserRepository;
import com.cooksys.social_media.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final ProfileMapper profileMapper;

    @Override
    public List<UserResponseDto> getAllUsers() {
        return userMapper.entitiesToDtos(userRepository.findAllByDeletedIsFalse());
    }

    @Override
    public UserResponseDto createUser(UserRequestDto userRequestDto) {
        CredentialsDto credentials = userRequestDto.getCredentials();
        ProfileDto profile = userRequestDto.getProfile();
        if (credentials == null || credentials.getUsername() == null || credentials.getUsername().isBlank()
                || credentials.getPassword() == null || credentials.getPassword().isBlank()) {
            throw new BadRequestException("Username and password are required");
        }
        if (profile == null || profile.getEmail() == null || profile.getEmail().isBlank()) {
            throw new BadRequestException("Email in profile is required");
        }
        if (userRepository.findByCredentialsUsernameAndDeletedIsFalse(credentials.getUsername())) {
            throw new BadRequestException("Username is already taken");
        }
        if (userRepository.findByCredentialsUsernameAndDeletedIsTrue(credentials.getUsername())) {
             User user = userRepository.findByCredentialsUsernameAndCredentialsPassword(credentials.getUsername(),
                     credentials.getPassword());
             user.setDeleted(false);
             user.setProfile(profileMapper.dtoToEntity(userRequestDto.getProfile()));
             return userMapper.entityToDto(userRepository.save(user));
        }
        return userMapper.entityToDto(userRepository.save(userMapper.dtoToEntity(userRequestDto)));
    }

    @Override
    public UserResponseDto getUserByUsername(String username) {
        return null;
    }

    @Override
    public UserResponseDto deleteUserByUsername(String username, CredentialsDto credentialsDto) {
        return null;
    }

    @Override
    public UserResponseDto updateUserByUsername(String username, UserRequestDto userRequestDto) {
        return null;
    }

    @Override
    public void followUser(String username, CredentialsDto credentialsDto) {

    }

    @Override
    public void unfollowUser(String username, CredentialsDto credentialsDto) {

    }

    @Override
    public TweetResponseDto getUserFeed(String username) {
        return null;
    }

    @Override
    public TweetResponseDto getUserTweets(String username) {
        return null;
    }

    @Override
    public TweetResponseDto getUserMentions(String username) {
        return null;
    }

    @Override
    public UserResponseDto getUserFollowers(String username) {
        return null;
    }

    @Override
    public UserResponseDto getUserFollowing(String username) {
        return null;
    }
}
