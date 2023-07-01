package com.grechi.systematicreviewreplicationapi.repository;

import com.grechi.systematicreviewcore.enums.PublisherTypeEnum;
import com.grechi.systematicreviewreplicationapi.model.PublisherType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherTypeRepository extends JpaRepository<PublisherType, PublisherTypeEnum> {
}
