package com.pcm.etiya.service;

import com.pcm.etiya.entity.Bundle;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BundleService {

  Bundle save(Bundle bundle);

  Bundle getById(Long id);

  void delete(Bundle bundle);

  void deleteById(Long id);

  List<Bundle> getAll();
}
