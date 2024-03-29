package com.example.birthdayback.mapper;

import com.example.birthdayback.dto.PhotographyDto;
import com.example.birthdayback.entity.Photography;

public class PhotographyMapper {
    public static PhotographyDto mapToPhotographyDto(Photography photography)
    {
        return new PhotographyDto(
            photography.getId(),
            photography.getName(),
            photography.getLocation(),
            photography.getAmount(),
            photography.isAvailable(),
            photography.getImage_Url()
        );
    }

    public static Photography mapToPhotography(PhotographyDto photographyDto)
    {
        return new Photography(
        photographyDto.getId(),
        photographyDto.getName(),
        photographyDto.getLocation(),
        photographyDto.getAmount(),
        photographyDto.isAvailable(),
        photographyDto.getImageUrl()
        );
    }
}
