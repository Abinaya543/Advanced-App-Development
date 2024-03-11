package com.admission.demo.Repository;

import com.admission.demo.Model.GiftDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiftDetailsRepository extends JpaRepository<GiftDetails, Long> {
}