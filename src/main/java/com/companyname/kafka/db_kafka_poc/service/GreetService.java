package com.companyname.kafka.db_kafka_poc.service;

import com.companyname.kafka.db_kafka_poc.entity.GreetMsg;
import com.companyname.kafka.db_kafka_poc.repository.GreetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class GreetService {

    private final GreetRepository greetRepository;
    private final KafkaProducer kafkaProducer;

    @Autowired
    public GreetService(GreetRepository greetRepository, KafkaProducer kafkaProducer) {
        this.greetRepository = greetRepository;
        this.kafkaProducer = kafkaProducer;
    }

    public GreetMsg saveGreet(GreetMsg greetMsg) {
        greetMsg.setCrtDt(new Date());
        kafkaProducer.sendMessage(greetMsg.toString());
        return greetRepository.save(greetMsg);
    }

    public List<GreetMsg> fetchAll() {
        return greetRepository.findAll();
    }
}
