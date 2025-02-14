package com.companyname.kafka.db_kafka_poc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Data
public class GreetMsgDTO {

    @Setter
    @Getter
    public String greetMsg;

    public String getGreetMsg() {
        return greetMsg;
    }

    public void setGreetMsg(String greetMsg) {
        this.greetMsg = greetMsg;
    }
}
