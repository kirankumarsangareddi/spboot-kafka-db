package com.companyname.kafka.db_kafka_poc.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "user_greet")
public class GreetMsg implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "msg_id")
    private Long id;
    @Column(name ="msg_str")
    private String greetMsg;
    @Column(name = "crt_dt")
    private Date crtDt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGreetMsg() {
        return greetMsg;
    }

    public void setGreetMsg(String greetMsg) {
        this.greetMsg = greetMsg;
    }

    public Date getCrtDt() {
        return crtDt;
    }

    public void setCrtDt(Date crtDt) {
        this.crtDt = crtDt;
    }
}
