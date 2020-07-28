package com.pcm.etiya.controller;

import com.pcm.etiya.entity.Bundle;
import com.pcm.etiya.service.BundleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bundle")
public class BundleController {


  private BundleService bundleService;

  @Autowired
  public BundleController(BundleService bundleService) {
    this.bundleService = bundleService;
  }

  @GetMapping("/{id}")
  public Bundle getById(@PathVariable Long id){
    return this.bundleService.getById(id);
  }

  @PostMapping("/save")
  public void save(@RequestBody Bundle bundle){
    this.bundleService.save(bundle);
  }

  @GetMapping("/bundles")
  public List<Bundle> getAll(){
    return this.bundleService.getAll();
  }

  @GetMapping("/delete/{id}")
  public void delete(@PathVariable Long id){
     this.bundleService.deleteById(id);
  }

}
