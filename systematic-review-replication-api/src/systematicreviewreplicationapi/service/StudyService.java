package com.grechi.systematicreviewreplicationapi.service;

import com.grechi.systematicreviewreplicationapi.dto.StudyDTO;
import com.grechi.systematicreviewreplicationapi.model.Approach;
import com.grechi.systematicreviewreplicationapi.model.Author;
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
    private AuthorRepository authorRepository;
    private ContributionRepository contributionRepository;
    private StudyRepository studyRepository;

    @Autowired
    public StudyService(ApproachService approachService, AuthorRepository authorRepository, ContributionRepository contributionRepository, StudyRepository studyRepository) {
        this.approachService = approachService;
        this.authorRepository = authorRepository;
        this.contributionRepository = contributionRepository;
        this.studyRepository = studyRepository;
    }

    public void save(StudyDTO studyDTO){
        Study study = new Study();
        study.setTitle(studyDTO.getTitle());
        study.setYear(studyDTO.getYear());
        study.setCitationIndex(studyDTO.getCitationIndex());
        study.setStandards(studyDTO.getStandards());
        study.setCaseStudy(studyDTO.getCaseStudy());

        study.setAuthors(new ArrayList<>());
        studyDTO.getAuthors().forEach(a -> {
            Author savedAuthor = authorRepository.save(a);
            study.getAuthors().add(savedAuthor);
        });

        contributionRepository.findById(studyDTO.getContribution())
                .ifPresent(study::setContribution);

        Approach savedApproach = this.approachService.save(studyDTO.getApproach());
        study.setApproach(savedApproach);

        studyRepository.save(study);
    }
}
