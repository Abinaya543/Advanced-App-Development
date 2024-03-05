package com.example.birthdayback.service;

import com.example.birthdayback.dto.GiftDto;
import java.util.List;

public interface GiftService {

    GiftDto createGift(GiftDto giftDto);

    GiftDto getGiftById(Long giftId);

    List<GiftDto> getAllGifts();

    GiftDto updateGift(Long giftId,GiftDto giftDto);

    void deleteGift(Long giftId);

}
