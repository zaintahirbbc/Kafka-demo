package com.kafkaexample.demo;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/messages")
public class Controller {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public Controller(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }



    @PostMapping
    public void publish(@RequestBody String message){
        kafkaTemplate.send("zain", message);

    }
}
