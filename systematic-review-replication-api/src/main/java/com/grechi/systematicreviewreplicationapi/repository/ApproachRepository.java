package com.grechi.systematicreviewreplicationapi.repository;

import com.grechi.systematicreviewreplicationapi.model.Approach;
import com.grechi.systematicreviewreplicationapi.model.Study;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApproachRepository extends JpaRepository<Approach, Integer> {
}
