package com.cooksys.social_media.services.impl;

import com.cooksys.social_media.exceptions.NotFoundException;
import com.cooksys.social_media.mappers.HashtagMapper;
import com.cooksys.social_media.respositories.HashTagRepository;
import com.cooksys.social_media.services.ValidateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ValidateServiceImpl implements ValidateService {

    private final HashTagRepository hashTagRepository;
    private final HashtagMapper hashtagMapper;


    @Override
    public boolean validateTagExists(String label) {
        String normalized = label.trim().replaceFirst("^#", ""); //convert
        hashTagRepository.findByLabelIgnoreCase(normalized).orElseThrow(() -> new NotFoundException("Hashtag ' " + label + "' not found")); //throw if not found

        return true;
    }
}
