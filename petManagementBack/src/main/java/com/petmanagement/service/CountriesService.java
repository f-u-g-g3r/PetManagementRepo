package com.petmanagement.service;

import com.petmanagement.model.Country;
import com.petmanagement.repository.CountriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountriesService {
    private final CountriesRepository countriesRepository;

    @Autowired
    public CountriesService(CountriesRepository countriesRepository) {
        this.countriesRepository = countriesRepository;
    }

    public List<Country> getAllCountries() {
        return countriesRepository.findAll();
    }
}
