package com.petmanagement.repository;

import com.petmanagement.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountriesRepository extends JpaRepository<Country, Long> {
}
