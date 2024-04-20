package com.example.SpringJMSProject.Sender;

import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${springjms.myQueue}")
    private String queue;
    public void send(String message)
    {
        // convert any message to JMS Message Type
//        jmsTemplate.convertAndSend(queue, message);
        MessageCreator messageCreator = s -> s.createTextMessage("Hello Spring JMS");
        jmsTemplate.send(queue, messageCreator);
    }
}
