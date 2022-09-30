package com.demo.engine;

import com.demo.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    private final Logger logger = LoggerFactory.getLogger(Producer.class);

    @KafkaListener(topics = "dummy", groupId = "group_id")
    public void consumerOne(User user) {
        logger.info(String.format("#### -> Consumer message -> %s", user));
    }

}
