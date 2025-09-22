package com.cooksys.social_media.dtos;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class ProfileDto {
    private String firstname;

    private String lastName;

    private String email;

    private String phone;


}
