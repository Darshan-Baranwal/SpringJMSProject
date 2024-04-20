package com.example.SpringJMSProject.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MyListener {
    @JmsListener(destination = "${springjms.myQueue}")
    public void receiver(String message) {
        System.out.println("Message Received ==>" + message);
    }
}
