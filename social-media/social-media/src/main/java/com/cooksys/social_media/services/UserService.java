package com.cooksys.social_media.services;

public interface UserService {
    String getAllUsers();

    String createUser();

    String getUserByUsername();

    String deleteUserByUsername();

    String updateUserByUsername();

    String followUser();

    String unfollowUser();

    String getUserFeed();

    String getUserTweets();

    String getUserMentions();

    String getUserFollowers();

    String getUserFollowing();
}
