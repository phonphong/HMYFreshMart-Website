package com.ecomerce.library.service.impl;

import com.ecomerce.library.model.City;
import com.ecomerce.library.repository.CityRepository;
import com.ecomerce.library.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {
    private final CityRepository cityRepository;

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }
}
