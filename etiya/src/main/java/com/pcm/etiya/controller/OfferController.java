package com.pcm.etiya.controller;


import com.pcm.etiya.entity.Offer;
import com.pcm.etiya.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OfferController {

  private OfferService offerService;

  @Autowired
  public OfferController(OfferService offerService) {
    this.offerService = offerService;
  }
  @GetMapping("/getAllOffer")
  public List<Offer> getAll(){
    return this.offerService.getAll();
  }

  @GetMapping("/offers/{id}")
  public Offer getById(@PathVariable Long id){
    return this.offerService.getById(id);
  }

  @GetMapping("/offerDelete/{id}")
  public void deleteById(@PathVariable Long id){
    this.offerService.deleteById(id);
  }

  @PostMapping("/delete")
  public void delete(@RequestBody Offer offer){
    this.offerService.delete(offer);
  }

  @PostMapping("/save")
  public void save(@RequestBody Offer offer){
    this.offerService.save(offer);
  }
}
