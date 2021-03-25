package com.demo.consumer;

import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@Component
public class consumer {

    @RabbitListener(queues = {Config.queue_email_name})
    public void listenToEmail(String msg) {
        System.out.println(msg);
    }

    @RabbitListener(queues = {Config.queue_sms_name})
    public void listenToSms(String msg) {
        System.out.println(msg);
    }
}
