package com.cooksys.social_media.controllers;

import com.cooksys.social_media.dtos.CredentialsDto;
import com.cooksys.social_media.dtos.TweetResponseDto;
import com.cooksys.social_media.dtos.UserRequestDto;
import com.cooksys.social_media.dtos.UserResponseDto;
import com.cooksys.social_media.entities.User;
import com.cooksys.social_media.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    @GetMapping
    public List<UserResponseDto> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public UserResponseDto createUser(@RequestBody UserRequestDto userRequestDto) {
        return userService.createUser(userRequestDto);
    }

    @GetMapping("/@{username}")
    public UserResponseDto getUserByUsername(@PathVariable String username) {
        return userService.getUserByUsername();
    }

    @PatchMapping("/@{username}")
    public UserResponseDto updateUserByUsername(@PathVariable String username,
                                                @RequestBody UserRequestDto userRequestDto) {
        return userService.updateUserByUsername(userRequestDto);
    }

    @DeleteMapping("/@{username}")
    public UserResponseDto deleteUserByUsername(@PathVariable String username,
                                                @RequestBody CredentialsDto credentialsDto) {
        return userService.deleteUserByUsername(credentialsDto);
    }

    @PostMapping("/@{username}/follow")
    public void followUser(@PathVariable String username,
                                      @RequestBody CredentialsDto credentialsDto) {
        userService.followUser(credentialsDto);
    }

    @PostMapping("/@{username}/unfollow")
    public void unfollowUser(@PathVariable String username,
                             @RequestBody CredentialsDto credentialsDto) {
        userService.unfollowUser();
    }

    @GetMapping("/@{username}/feed")
    public TweetResponseDto getUserFeed(@PathVariable String username) {
        return userService.getUserFeed();
    }

    @GetMapping("/@{username}/tweets")
    public TweetResponseDto getUserTweets(@PathVariable String username) {
        return userService.getUserTweets();
    }

    @GetMapping("/@{username}/mentions")
    public TweetResponseDto getUserMentions(@PathVariable String username) {
        return userService.getUserMentions();
    }

    @GetMapping("/@{username}/followers")
    public UserResponseDto getUserFollowers(@PathVariable String username) {
        return userService.getUserFollowers();
    }

    @GetMapping("/@{username}/following")
    public UserResponseDto getUserFollowing(@PathVariable String username) {
        return userService.getUserFollowing();
    }

}
