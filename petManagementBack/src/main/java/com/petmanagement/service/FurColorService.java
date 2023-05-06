package com.petmanagement.service;

import com.petmanagement.model.FurColor;
import com.petmanagement.repository.FurColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FurColorService {
    private final FurColorRepository furColorRepository;

    @Autowired
    public FurColorService(FurColorRepository furColorRepository) {
        this.furColorRepository = furColorRepository;
    }

    public List<FurColor> getAllFurColors() {
        return furColorRepository.findAll();
    }
}
