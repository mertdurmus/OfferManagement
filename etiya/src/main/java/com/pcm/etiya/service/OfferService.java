package com.pcm.etiya.service;

import com.pcm.etiya.entity.Offer;
import org.springframework.stereotype.Service;
import java.util.List;

public interface OfferService {

  Offer save(Offer offer);

  Offer getById(Long id);

  List<Offer> getAll();

  void delete(Offer offer);

  void deleteById(Long id);
}
