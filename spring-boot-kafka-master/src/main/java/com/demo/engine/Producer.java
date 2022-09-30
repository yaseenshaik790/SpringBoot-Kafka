package com.demo.engine;

import com.demo.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    private static final Logger logger = LoggerFactory.getLogger(Producer.class);
    private static final String TOPIC = "dummy";

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    public void sendMessageFromProdOne(User user) {
        logger.info(String.format("#### -> Producing message -> %s", user));
        this.kafkaTemplate.send(TOPIC, user);
    }

}
