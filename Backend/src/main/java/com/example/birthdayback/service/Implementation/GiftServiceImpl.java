package com.example.birthdayback.service.Implementation;

import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.birthdayback.dto.GiftDto;
import com.example.birthdayback.entity.Gift;
import com.example.birthdayback.exception.ResourceNotFoundException;
import com.example.birthdayback.mapper.GiftMapper;
import com.example.birthdayback.repository.GiftRepository;
import com.example.birthdayback.service.GiftService;

import lombok.AllArgsConstructor;
import  java.util.List;

@Service
@AllArgsConstructor
public class GiftServiceImpl implements GiftService {
    
    private final  GiftRepository GiftRepository;

    @Override
     public GiftDto createGift(GiftDto giftDto) {
        Gift gift = GiftMapper.mapToGift(giftDto);
        Gift savedGift = GiftRepository.save(gift);
        return GiftMapper.mapToGiftDto(savedGift);
    }

    @Override
    public GiftDto getGiftById(Long giftId) {
        Gift gift = GiftRepository.findById(giftId)
                .orElseThrow(() -> new ResourceNotFoundException("Gift not found with id: " + giftId));
        return GiftMapper.mapToGiftDto(gift);
    }

    @Override
    public List<GiftDto> getAllGifts() {
        List<Gift> gifts = GiftRepository.findAll();
        return gifts.stream().map(GiftMapper::mapToGiftDto).collect(Collectors.toList());
    }

    @Override
    public GiftDto updateGift(Long giftId, GiftDto giftDto) {
        Gift existingGift = GiftRepository.findById(giftId)
                .orElseThrow(() -> new ResourceNotFoundException("Gift not found with id: " + giftId));
        Gift updatedGift = GiftMapper.mapToGift(giftDto);
        updatedGift.setId(existingGift.getId());
        Gift savedGift = GiftRepository.save(updatedGift);
        return GiftMapper.mapToGiftDto(savedGift);
    }

    @Override
    public void deleteGift(Long giftId) {
        GiftRepository.deleteById(giftId);
    }
}
