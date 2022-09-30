package com.demo.controllers;

import com.demo.bean.User;
import com.demo.engine.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    @Autowired
    private Producer producer;

    public KafkaController() {
        super();
    }

    @PostMapping(value = "/publish")
    public String sendMessageFromProducerOne(@RequestBody User product) {
        this.producer.sendMessageFromProdOne(product);
        return "Message Sent Successfully";
    }

}
