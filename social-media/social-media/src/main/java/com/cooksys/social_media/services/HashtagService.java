package com.cooksys.social_media.services;

import com.cooksys.social_media.dtos.HashtagDto;
import com.cooksys.social_media.dtos.TweetResponseDto;

public interface HashtagService {
    HashtagDto getAllTags();

    TweetResponseDto getTag(String label);
}
