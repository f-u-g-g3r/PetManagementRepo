package com.petmanagement.resource;

import com.petmanagement.model.Country;
import com.petmanagement.service.CountriesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryResource {
    private final CountriesService countriesService;

    public CountryResource(CountriesService countriesService) {
        this.countriesService = countriesService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Country>> getAllCountries() {
        List<Country> countries = countriesService.getAllCountries();
        return new ResponseEntity<>(countries, HttpStatus.OK);
    }
}
