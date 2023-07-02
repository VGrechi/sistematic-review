package com.grechi.systematicreviewreplicationapi.service;

import com.grechi.systematicreviewreplicationapi.dto.StudyDTO;
import com.grechi.systematicreviewreplicationapi.model.Approach;
import com.grechi.systematicreviewreplicationapi.model.Author;
import com.grechi.systematicreviewreplicationapi.model.Publisher;
import com.grechi.systematicreviewreplicationapi.model.Study;
import com.grechi.systematicreviewreplicationapi.repository.AuthorRepository;
import com.grechi.systematicreviewreplicationapi.repository.ContributionRepository;
import com.grechi.systematicreviewreplicationapi.repository.StudyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudyService {

    private ApproachService approachService;

    private PublisherService publisherService;
    private AuthorRepository authorRepository;
    private ContributionRepository contributionRepository;
    private StudyRepository studyRepository;

    @Autowired
    public StudyService(ApproachService approachService, PublisherService publisherService, AuthorRepository authorRepository, ContributionRepository contributionRepository, StudyRepository studyRepository) {
        this.approachService = approachService;
        this.publisherService = publisherService;
        this.authorRepository = authorRepository;
        this.contributionRepository = contributionRepository;
        this.studyRepository = studyRepository;
    }

    public void save(StudyDTO studyDTO){
        Study study = new Study();
        study.setStudyId(Integer.parseInt(studyDTO.getStudyId()));
        study.setTitle(studyDTO.getTitle());
        study.setYear(studyDTO.getYear());
        study.setCitationIndex(studyDTO.getCitationIndex());
        study.setStandards(studyDTO.getStandards());
        study.setCaseStudy(studyDTO.getCaseStudy());
        study.setLatexCitationCommand(studyDTO.getLatexCitationCommand());
        study.setReference(studyDTO.getReference());

        study.setAuthors(new ArrayList<>());
        studyDTO.getAuthors().forEach(a -> {
            Author savedAuthor = authorRepository.save(a);
            study.getAuthors().add(savedAuthor);
        });

        contributionRepository.findById(studyDTO.getContribution())
                .ifPresent(study::setContribution);

        Approach savedApproach = this.approachService.save(studyDTO.getApproach());
        study.setApproach(savedApproach);

        Publisher savedPublisher = this.publisherService.save(studyDTO.getPublisher());
        study.setPublisher(savedPublisher);

        studyRepository.save(study);
    }
}
