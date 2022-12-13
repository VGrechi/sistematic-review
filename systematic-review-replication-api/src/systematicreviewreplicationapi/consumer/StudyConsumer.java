package com.grechi.systematicreviewreplicationapi.consumer;


import com.grechi.systematicreviewreplicationapi.dto.StudyDTO;
import com.grechi.systematicreviewreplicationapi.service.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class StudyConsumer {

    @Autowired
    private StudyService studyService;

    @KafkaListener(topics = "study-creation-topic", groupId = "1")
    public void receiveMessages(StudyDTO study){
        this.studyService.save(study);
    }
}
