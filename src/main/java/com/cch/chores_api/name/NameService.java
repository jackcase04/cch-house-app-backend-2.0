package com.cch.chores_api.name;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NameService {
    private final NameRepository nameRepository;

    @Autowired
    public NameService(NameRepository nameRepository) {
        this.nameRepository = nameRepository;
    }

    public List<Name> getNames() {
        return nameRepository.findAll();
    }
}

