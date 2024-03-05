package com.example.birthdayback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.birthdayback.entity.Gift;

@Repository
public interface GiftRepository extends JpaRepository<Gift,Long> {

}
