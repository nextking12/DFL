package org.backend.dfldemo.respository;

import org.backend.dfldemo.models.HomeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeRepository extends JpaRepository<HomeEntity, Long> {
}