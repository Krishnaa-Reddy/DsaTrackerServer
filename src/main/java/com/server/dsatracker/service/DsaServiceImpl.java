package com.server.dsatracker.service;

import com.server.dsatracker.repository.DsaRepository;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Log4j2
public class DsaServiceImpl implements DsaService{

    private DsaRepository dsaRepository;

    @Override
    public void doSomething() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
