package com.demo.producer.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
 public class send {
    @Autowired
    RabbitTemplate rabbitTemplate;


    String msg1 = "这时我自己写给email的";

    @Test
    public void sendtestemail() {
        for (int i = 0; i < 5; i++) {
            rabbitTemplate.convertAndSend(Config.exchange_topic_name, "email.info", msg1+"第"+i+"条");
        }
    }

    String msg2 = "这时我自己写给sms的";

    @Test
    public void sendtestsms() {
        for (int i = 0; i < 5; i++) {
            rabbitTemplate.convertAndSend(Config.exchange_topic_name, "sms.info", msg2+"第"+i+"条");
        }
    }


}
