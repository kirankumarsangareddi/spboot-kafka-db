package com.companyname.kafka.db_kafka_poc.controller;

import com.companyname.kafka.db_kafka_poc.service.GreetService;
import com.companyname.kafka.db_kafka_poc.dto.GreetMsgDTO;
import com.companyname.kafka.db_kafka_poc.entity.GreetMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {


    private final GreetService greetService;

    @Autowired
    public TestController(GreetService greetService) {
        this.greetService = greetService;
    }

    @GetMapping("/greet")
    public GreetMsgDTO greetMsgGet(@ModelAttribute GreetMsgDTO greetMsgDTO) {
        GreetMsg greetMsg = new GreetMsg();
        greetMsg.setGreetMsg(greetMsgDTO.getGreetMsg());
        this.greetService.saveGreet(greetMsg);
        return greetMsgDTO;
    }

    @GetMapping("/greet/all")
    public List<GreetMsg> fetchAll() {
        return greetService.fetchAll();
    }

    @PostMapping("/greet")
    public GreetMsgDTO greetMsgPost(@RequestBody GreetMsgDTO greetMsgDTO) {
        GreetMsg greetMsg = new GreetMsg();
        greetMsg.setGreetMsg(greetMsgDTO.getGreetMsg());
        this.greetService.saveGreet(greetMsg);
        return greetMsgDTO;
    }


}
