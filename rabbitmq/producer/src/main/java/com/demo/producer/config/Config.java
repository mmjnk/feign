package com.demo.producer.config;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    public static final String queue_email_name="queue_email_name";
    public static final String queue_sms_name="queue_sms_name";
    public static final String exchange_topic_name="exchange_topic_name";
    public static final String routingkey_email="#.email.#";
    public static final String routingkey_sms="#.sms.#";

    /**
     * 配置交换机
     */
    @Bean(exchange_topic_name)
    public Exchange exchange(){
      return  ExchangeBuilder.topicExchange(exchange_topic_name).durable(true).build();
    }
    /**
     * 配置email通道
     */
    @Bean(queue_email_name)
    public Queue queue_email(){
        return new Queue(queue_email_name);
    }

    /**
     * 配置短信通道
     * @return
     */
    @Bean(queue_sms_name)
    public Queue queue_sms(){
        return new Queue(queue_sms_name);
    }
    /**
     * 绑定excahnge和email通道和routingkey
     */
    @Bean
    public Binding binding_email(@Qualifier(exchange_topic_name) Exchange exchange,@Qualifier(queue_email_name) Queue queue){
        return BindingBuilder.bind(queue).to(exchange).with(routingkey_email).noargs();
    }
    /**
     * 绑定exchange和sms通道和routingkey
     */
    @Bean
    public Binding binding_sms(@Qualifier(exchange_topic_name) Exchange exchange,@Qualifier(queue_sms_name) Queue queue){
        return BindingBuilder.bind(queue).to(exchange).with(routingkey_sms).noargs();
    }
}

















