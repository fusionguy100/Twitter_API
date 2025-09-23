package com.cooksys.social_media.controllers;

import com.cooksys.social_media.services.TweetService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/tweets")
public class TweetController {

    private final TweetService tweetService;
    @GetMapping
    public String getTweets() {
        return tweetService.getTweets();
    }

    @PostMapping
    public String postTweet() {
        return tweetService.postTweet();
    }

    @GetMapping("/{id}")
    public String getTweetById(@PathVariable String id) {
        return tweetService.getTweetById();
    }

    @DeleteMapping("/{id}")
    public String deleteTweetById(@PathVariable String id) {
        return tweetService.deleteTweetById();
    }

    @PostMapping("/{id}/like")
    public String likeTweetById(@PathVariable String id) {
        return tweetService.likeTweetById();
    }

    @PostMapping("/{id}/reply")
    public String replyToTweetById(@PathVariable String id) {
        return tweetService.replyToTweetById();
    }

    @GetMapping("/{id}/tags")
    public String getTagsByTweetId(@PathVariable String id) {
        return tweetService.getTagsByTweetId();
    }

    @GetMapping("/{id}/likes")
    public String getLikesByTweetId(@PathVariable String id) {
        return tweetService.getLikesByTweetId();
    }

    @GetMapping("/{id}/context")
    public String getContextByTweetId(@PathVariable String id) {
        return tweetService.getContextByTweetId();
    }

    @GetMapping("/{id}/replies")
    public String getRepliesByTweetId(@PathVariable String id) {
        return tweetService.getRepliesByTweetId();
    }

    @GetMapping("/{id}/reposts")
    public String getRepostsByTweetId(@PathVariable String id) {
        return tweetService.getRepostsByTweetId();
    }

    @GetMapping("/{id}/mentions")
    public String getMentionsByTweetId(@PathVariable String id) {
        return tweetService.getMentionsByTweetId();
    }
}
