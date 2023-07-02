package com.grechi.systematicreviewapi.producer;

import com.grechi.systematicreviewapi.model.Study;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class StudyProducer {

    @Autowired
    private KafkaTemplate<String, Study> kafkaTemplate;

    public void sendMessage(Study study){
        kafkaTemplate.send("study-creation-topic", study);
    }
}
