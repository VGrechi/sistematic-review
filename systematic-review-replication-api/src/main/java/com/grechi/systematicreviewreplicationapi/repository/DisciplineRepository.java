package com.grechi.systematicreviewreplicationapi.repository;

import com.grechi.systematicreviewcore.enums.DisciplineEnum;
import com.grechi.systematicreviewreplicationapi.model.Discipline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplineRepository extends JpaRepository<Discipline, DisciplineEnum> {}
