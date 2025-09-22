package com.cooksys.social_media.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@NoArgsConstructor
@Getter
@Setter
public class HashTagDto {

    private String label;

    Timestamp firstUsed;

    Timestamp lastUsed;

}
