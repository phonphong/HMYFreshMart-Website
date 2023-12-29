package com.ecomerce.library.service.impl;

import com.ecomerce.library.model.Country;
import com.ecomerce.library.repository.CountryRepository;
import com.ecomerce.library.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService {
    private final CountryRepository countryRepository;

    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }
}
