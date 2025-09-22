package com.cooksys.social_media.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@NoArgsConstructor
@Getter
@Setter
public class HashtagDto {

    private String label;

    private Timestamp firstUsed;

    private Timestamp lastUsed;

}
