package com.cooksys.social_media.services.impl;

import com.cooksys.social_media.services.HashtagService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HashtagServiceImpl implements HashtagService {
    @Override
    public String getAllTags() {
        return "";
    }

    @Override
    public String getTag(String label) {
        return "";
    }
}
