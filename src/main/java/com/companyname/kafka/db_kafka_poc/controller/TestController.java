package com.companyname.kafka.db_kafka_poc.controller;

import com.companyname.kafka.db_kafka_poc.dto.GreetMsgDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/greet")
    public GreetMsgDTO greetMsgGet(@ModelAttribute GreetMsgDTO greetMsgDTO) {
        return greetMsgDTO;
    }

    @PostMapping("/greet")
    public GreetMsgDTO greetMsgPost(@RequestBody GreetMsgDTO greetMsgDTO) {
        return greetMsgDTO;
    }


}
