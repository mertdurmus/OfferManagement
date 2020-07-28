package com.pcm.etiya.service.impl;


import com.pcm.etiya.entity.Bundle;
import com.pcm.etiya.repository.BundleRepository;
import com.pcm.etiya.service.BundleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BundleServiceImpl implements BundleService {

  @Autowired
  private BundleRepository bundleRepository;


  @Override
  public Bundle save(Bundle bundle) {
    return bundleRepository.save(bundle);
  }

  @Override
  public Bundle getById(Long id) {
    return bundleRepository.getById(id);
  }

  @Override
  public void delete(Bundle bundle) {
    this.bundleRepository.delete(bundle);
  }

  @Override
  public void deleteById(Long id) {
    Bundle bundle = this.bundleRepository.getById(id);
    this.bundleRepository.delete(bundle);
  }

  @Override
  public List<Bundle> getAll() {
    return this.bundleRepository.findAll();
  }
}
