package com.pcm.etiya.service.impl;

import com.pcm.etiya.entity.Offer;
import com.pcm.etiya.repository.OfferRepository;
import com.pcm.etiya.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfferServiceImpl implements OfferService {

  @Autowired
  private OfferRepository offerRepository;

  @Override
  public Offer save(Offer offer) {
    return offerRepository.save(offer);
  }

  @Override
  public Offer getById(Long id) {
    return offerRepository.getById(id);
  }

  @Override
  public List<Offer> getAll() {
    return offerRepository.findAll();
  }

  @Override
  public void  delete(Offer offer) {
     offerRepository.delete(offer);
  }

  @Override
  public void deleteById(Long id) {
    Offer offer= offerRepository.getOne(id);
    offerRepository.delete(offer);
  }
}
