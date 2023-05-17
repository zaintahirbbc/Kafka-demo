package com.kafkaexample.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafaListeners {

    @KafkaListener(topics = "zain", groupId = "groupId")
    void listener(String data){
        System.out.println("Recieved data: " + data);
    }
}
