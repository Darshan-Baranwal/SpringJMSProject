package com.example.SpringJMSProject;

import com.example.SpringJMSProject.Sender.MessageSender;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ComponentScan(basePackages = "src")
class SpringJmsProjectApplicationTests {
	@Autowired
	MessageSender messageSender;

	@Test
	void testSendAndReceive() {
		messageSender.send("Hello Spring JMS");
	}

}
