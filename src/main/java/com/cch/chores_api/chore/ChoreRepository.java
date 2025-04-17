package com.cch.chores_api.chore;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChoreRepository extends JpaRepository<Chore, Long> {
    Chore findByNameAndDate(String name, String date);
}

