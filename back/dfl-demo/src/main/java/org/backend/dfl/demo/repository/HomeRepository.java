package org.backend.dfl.demo.repository;

import org.backend.dfl.demo.models.HomeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeRepository extends JpaRepository<HomeEntity, Long> {
}
