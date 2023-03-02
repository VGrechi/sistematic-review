package com.grechi.systematicreviewreplicationapi.repository;

import com.grechi.systematicreviewcore.enums.MentionTypeEnum;
import com.grechi.systematicreviewreplicationapi.model.MentionType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MentionTypeRepository extends JpaRepository<MentionType, MentionTypeEnum> {}
