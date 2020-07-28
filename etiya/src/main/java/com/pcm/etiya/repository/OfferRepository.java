package com.pcm.etiya.repository;

import com.pcm.etiya.entity.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface OfferRepository extends JpaRepository<Offer, Long> {

  Offer getById(Long id);
}
