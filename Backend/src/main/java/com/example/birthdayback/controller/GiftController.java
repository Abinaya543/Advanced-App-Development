package com.example.birthdayback.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.birthdayback.dto.GiftDto;
import com.example.birthdayback.service.GiftService;

import lombok.AllArgsConstructor;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/Gifts")
public class GiftController {
    
    private GiftService giftService;

    // @PreAuthorize("hasRole('ADMIN')")
    @PreAuthorize("hasAuthority('ADMIN')")
    @PostMapping
    public ResponseEntity<GiftDto> createGift(@RequestBody GiftDto giftDto) {
        GiftDto savedGift = giftService.createGift(giftDto);
        return new ResponseEntity<>(savedGift, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<GiftDto> getGiftById(@PathVariable("id") Long giftId) {
        GiftDto giftDto = giftService.getGiftById(giftId);
        return ResponseEntity.ok(giftDto);
    }

    @GetMapping
    public ResponseEntity<List<GiftDto>> getAllGifts() {
        List<GiftDto> gifts = giftService.getAllGifts();
        return ResponseEntity.ok(gifts);
    }

    // @PreAuthorize("hasRole('ADMIN')")
    @PreAuthorize("hasAuthority('ADMIN')")
    @PutMapping("{id}")
    public ResponseEntity<GiftDto> updateGift(@PathVariable("id") Long giftId, @RequestBody GiftDto giftDto) {
        GiftDto updatedGift = giftService.updateGift(giftId, giftDto);
        return ResponseEntity.ok(updatedGift);
    }

    // @PreAuthorize("hasRole('ADMIN')")
    @PreAuthorize("hasAuthority('ADMIN')")
    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteGift(@PathVariable("id") Long giftId) {
        giftService.deleteGift(giftId);
        return ResponseEntity.noContent().build();
    }
}
