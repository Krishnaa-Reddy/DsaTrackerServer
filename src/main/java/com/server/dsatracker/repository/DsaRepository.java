package com.server.dsatracker.repository;

import com.server.dsatracker.model.entity.Problem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DsaRepository extends JpaRepository<Problem, Long> {
}
