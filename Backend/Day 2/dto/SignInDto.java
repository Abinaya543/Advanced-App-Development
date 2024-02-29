package com.example.gift.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SignInDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}