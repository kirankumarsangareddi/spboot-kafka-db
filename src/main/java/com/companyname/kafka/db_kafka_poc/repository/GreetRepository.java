package com.companyname.kafka.db_kafka_poc.repository;

import com.companyname.kafka.db_kafka_poc.entity.GreetMsg;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetRepository extends JpaRepository<GreetMsg, Long> {
}
