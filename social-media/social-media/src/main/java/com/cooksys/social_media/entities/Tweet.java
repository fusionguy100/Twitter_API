package com.cooksys.social_media.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Tweet {
    @Id
    @GeneratedValue
    private long id;

    private Timestamp posted;

    private String content;
    private boolean deleted = false;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;

    @ManyToMany(mappedBy = "likedTweets")
    private Set<User> likedBy;

    @ManyToMany(mappedBy = "mentionedIn")
    private Set<User> mentions;

    @ManyToOne
    @JoinColumn(name = "inReplyTo")
    private Tweet inReplyTo;

    @OneToMany(mappedBy = "inReplyTo")
    private Set<Tweet> replies;

    @ManyToOne
    @JoinColumn(name="rePostOf")
    private Tweet rePostOf;

    @OneToMany(mappedBy = "rePostOf")
    private Set<Tweet> rePosts;

    @ManyToMany
    @JoinTable(
        name = "tweet_hashtags",
        joinColumns = @JoinColumn(name = "tweet_id"),
        inverseJoinColumns = @JoinColumn(name = "hashtag_id")
    )
    private Set<Hashtag> hashtags;
}
