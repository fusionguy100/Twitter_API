package com.cooksys.social_media.services.impl;

import com.cooksys.social_media.dtos.HashtagDto;
import com.cooksys.social_media.dtos.TweetResponseDto;
import com.cooksys.social_media.services.HashtagService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HashtagServiceImpl implements HashtagService {

    @Override
    public List<HashtagDto> getAllTags() {
        return null;
    }

    @Override
    public List<TweetResponseDto> getTag(String label) {
        return null;
    }
}
