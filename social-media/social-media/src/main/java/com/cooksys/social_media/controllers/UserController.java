package com.cooksys.social_media.controllers;

import com.cooksys.social_media.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    @GetMapping
    public String getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public String createUser() {
        return userService.createUser();
    }

    @GetMapping("/@{username}")
    public String getUserByUsername(@PathVariable String username) {
        return userService.getUserByUsername();
    }

    @PatchMapping("/@{username}")
    public String updateUserByUsername(@PathVariable String username) {
        return userService.updateUserByUsername();
    }

    @DeleteMapping("/@{username}")
    public String deleteUserByUsername(@PathVariable String username) {
        return userService.deleteUserByUsername();
    }

    @PostMapping("/@{username}/follow")
    public String followUser(@PathVariable String username) {
        return userService.followUser();
    }

    @PostMapping("/@{username}/unfollow")
    public String unfollowUser(@PathVariable String username) {
        return userService.unfollowUser();
    }

    @GetMapping("/@{username}/feed")
    public String getUserFeed(@PathVariable String username) {
        return userService.getUserFeed();
    }

    @GetMapping("/@{username}/tweets")
    public String getUserTweets(@PathVariable String username) {
        return userService.getUserTweets();
    }

    @GetMapping("/@{username}/mentions")
    public String getUserMentions(@PathVariable String username) {
        return userService.getUserMentions();
    }

    @GetMapping("/@{username}/followers")
    public String getUserFollowers(@PathVariable String username) {
        return userService.getUserFollowers();
    }

    @GetMapping("/@{username}/following")
    public String getUserFollowing(@PathVariable String username) {

        return userService.getUserFollowing();
    }

}
