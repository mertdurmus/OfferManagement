package com.pcm.etiya.repository;

import com.pcm.etiya.entity.Bundle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface BundleRepository extends JpaRepository<Bundle, Long> {
  Bundle getById(Long id);
}
