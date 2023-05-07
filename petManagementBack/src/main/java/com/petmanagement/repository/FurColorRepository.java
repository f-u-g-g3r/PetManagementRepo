package com.petmanagement.repository;

import com.petmanagement.model.FurColor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FurColorRepository extends JpaRepository<FurColor, Long> {
}
