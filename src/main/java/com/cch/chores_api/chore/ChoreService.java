package com.cch.chores_api.chore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ChoreService {
    private final ChoreRepository choreRepository;

    @Autowired
    public ChoreService(ChoreRepository choreRepository) {
        this.choreRepository = choreRepository;
    }

    public List<Chore> getChores() {
        return choreRepository.findAll();
    }

    public List<Chore> getChoresFromName(String name) {
        return choreRepository.findAll().stream()
            .filter(chore -> name.equals(chore.getName()))
            .collect(Collectors.toList());
    }

    public List<Chore> getChoresByNameAndDate(String name, String date) {
        return choreRepository.findAll().stream()
            .filter(chore ->
                name.equals(chore.getName()) &&
                date.equals(chore.getDate())
            )
            .collect(Collectors.toList());
    }
}
