package com.cooksys.social_media.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
@NoArgsConstructor
@Getter
@Setter
public class UserResponseDto {
    private String username;

    private ProfileDto profile;

    private Timestamp joined;



}
