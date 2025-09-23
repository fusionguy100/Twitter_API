package com.cooksys.social_media.controllers;

import com.cooksys.social_media.dtos.*;
import com.cooksys.social_media.services.TweetService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/tweets")
public class TweetController {

    private final TweetService tweetService;
    @GetMapping
    public TweetResponseDto getTweets() {
        return tweetService.getTweets();
    }

    @PostMapping
    public TweetResponseDto postTweet(@RequestBody TweetRequestDto tweetRequestDto) {
        return tweetService.postTweet(tweetRequestDto);
    }

    @GetMapping("/{id}")
    public TweetResponseDto getTweetById(@PathVariable String id) {
        return tweetService.getTweetById();
    }

    @DeleteMapping("/{id}")
    public TweetResponseDto deleteTweetById(@PathVariable String id,
                                            @RequestBody CredentialsDto credentialsDto) {
        return tweetService.deleteTweetById(credentialsDto);
    }

    @PostMapping("/{id}/like")
    public void likeTweetById(@PathVariable String id, @RequestBody CredentialsDto credentialsDto) {
        tweetService.likeTweetById(credentialsDto);
    }

    @PostMapping("/{id}/reply")
    public TweetResponseDto replyToTweetById(@PathVariable String id,
                                   @RequestBody TweetRequestDto tweetRequestDto) {
        return tweetService.replyToTweetById(tweetRequestDto);
    }

    @PostMapping("/{id}/repost")
    public TweetResponseDto repostTweetById(@PathVariable String id,
                                  @RequestBody CredentialsDto credentialsDto) {
        return tweetService.repostTweetById(credentialsDto);
    }

    @GetMapping("/{id}/tags")
    public HashtagDto getTagsByTweetId(@PathVariable String id) {
        return tweetService.getTagsByTweetId();
    }

    @GetMapping("/{id}/likes")
    public UserResponseDto getLikesByTweetId(@PathVariable String id) {
        return tweetService.getLikesByTweetId();
    }

    @GetMapping("/{id}/context")
    public ContextDto getContextByTweetId(@PathVariable String id) {
        return tweetService.getContextByTweetId();
    }

    @GetMapping("/{id}/replies")
    public TweetResponseDto getRepliesByTweetId(@PathVariable String id) {
        return tweetService.getRepliesByTweetId();
    }

    @GetMapping("/{id}/reposts")
    public TweetResponseDto getRepostsByTweetId(@PathVariable String id) {
        return tweetService.getRepostsByTweetId();
    }

    @GetMapping("/{id}/mentions")
    public UserResponseDto getMentionsByTweetId(@PathVariable String id) {
        return tweetService.getMentionsByTweetId();
    }
}
