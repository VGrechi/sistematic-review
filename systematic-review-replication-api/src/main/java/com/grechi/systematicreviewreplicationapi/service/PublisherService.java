package com.grechi.systematicreviewreplicationapi.service;

import com.grechi.systematicreviewreplicationapi.dto.ApproachDTO;
import com.grechi.systematicreviewreplicationapi.dto.PublisherDTO;
import com.grechi.systematicreviewreplicationapi.model.Approach;
import com.grechi.systematicreviewreplicationapi.model.Publisher;
import com.grechi.systematicreviewreplicationapi.model.Tool;
import com.grechi.systematicreviewreplicationapi.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PublisherService {

    private final PublisherRepository publisherRepository;
    private final PublisherTypeRepository publisherTypeRepository;

    @Autowired
    public PublisherService(PublisherRepository publisherRepository, PublisherTypeRepository publisherTypeRepository) {
        this.publisherRepository = publisherRepository;
        this.publisherTypeRepository = publisherTypeRepository;
    }

    public Publisher save(PublisherDTO publisherDTO){
        Publisher publisher = new Publisher();
        publisher.setName(publisherDTO.getName());
        publisher.setSubject(publisherDTO.getSubject());

        publisherTypeRepository.findById(publisherDTO.getPublisherType())
                .ifPresent(publisher::setPublisherType);

        return publisherRepository.save(publisher);
    }
}
