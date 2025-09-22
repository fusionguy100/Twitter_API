package com.cooksys.social_media.entities;

import com.cooksys.social_media.entities.embeddables.Credentials;
import com.cooksys.social_media.entities.embeddables.Profile;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

@Table(name="user_table")
@Entity
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private Long id;
    @Embedded
    Profile profile;
    @Embedded
    Credentials credentials;
    private boolean deleted = false;
    private Timestamp joined;

    @ManyToMany
    @JoinTable(
            name="followers_following",
            joinColumns = @JoinColumn(name="follower_id"),
            inverseJoinColumns = @JoinColumn(name="following_id")
    )
    private Set<User> followers;
    @ManyToMany(mappedBy = "followers")
    private Set<User> following;

    @OneToMany(mappedBy = "author")
    private List<Tweet> tweets;

    @ManyToMany
    @JoinTable(
            name="user_likes",
            joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns = @JoinColumn(name="tweet_id")
    )
    private Set<Tweet> likedTweets;

    @ManyToMany
    @JoinTable(
            name="user_mentions",
            joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns = @JoinColumn(name="tweet_id")
    )
    private Set<Tweet> mentionedIn;
}
