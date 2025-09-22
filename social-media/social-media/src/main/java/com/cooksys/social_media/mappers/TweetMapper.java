package com.cooksys.social_media.mappers;

import com.cooksys.social_media.dtos.TweetRequestDto;
import com.cooksys.social_media.dtos.TweetResponseDto;
import com.cooksys.social_media.entities.Tweet;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = { UserMapper.class, CredentialsMapper.class, HashtagMapper.class, ProfileMapper.class, TweetMapper.class })
public interface TweetMapper {

    TweetResponseDto entityToDto(Tweet entity);

    List<TweetResponseDto> entitiesToDtos(List<Tweet> entities);

    Tweet dtoToEntity(TweetRequestDto dto);
}
