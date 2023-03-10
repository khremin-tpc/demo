package com.example.demo.service.impl;

import com.example.demo.model.DemoClass;
import com.example.demo.persistence.repository.FirstTableRepository;
import com.example.demo.service.GreetingsService;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

@Service
public class GreetingsServiceImpl implements GreetingsService {

    private final FirstTableRepository firstTableRepository;

    public GreetingsServiceImpl(FirstTableRepository firstTableRepository) {
        this.firstTableRepository = firstTableRepository;
    }

    @Override
    public DemoClass getGreetingsMessage(long id, String name) {
        Instant dob = Instant.now().minus(10, ChronoUnit.HOURS);
        return new DemoClass(id, name, dob, firstTableRepository.findAll());
    }
}
