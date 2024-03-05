package com.example.birthdayback.mapper;

import com.example.birthdayback.dto.GiftDto;
import com.example.birthdayback.entity.Gift;

public class GiftMapper {
    
    public static GiftDto mapToGiftDto(Gift gift)
    {
        return new  GiftDto(
            gift.getId(),
            gift.getName(),
            gift.getAmount(),
            gift.getFlavour(),
            gift.getTheme(),
            gift.getQuantity(),
            gift.getImageUrl()
        );
    }

    public static Gift mapToGift(GiftDto giftDto)
    {
        return new Gift(
            giftDto.getId(),
            giftDto.getName(),
           giftDto.getAmount(),
            giftDto.getFlavour(),
            giftDto.getTheme(),
            giftDto.getQuantity(),
            giftDto.getImageUrl()
        );
    }
}
