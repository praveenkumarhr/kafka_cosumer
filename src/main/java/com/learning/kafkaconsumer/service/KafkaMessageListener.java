package com.learning.kafkaconsumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service

public class KafkaMessageListener {

	Logger logger = LoggerFactory.getLogger(getClass());

	@KafkaListener(topics = { "java-tecie-demo-5" }, groupId = "consumer-group-3")
	public void messageConsumer1(String message) {

		logger.info("Consumer1 consume the message {}", message);

	}

	@KafkaListener(topics = { "java-tecie-demo-5" }, groupId = "consumer-group-3")
	public void messageConsumer2(String message) {

		logger.info("Consumer2 consume the message {}", message);

	}

	@KafkaListener(topics = { "java-tecie-demo-5" }, groupId = "consumer-group-3")
	public void messageConsumer3(String message) {

		logger.info("Consumer3 consume the message {}", message);

	}

	@KafkaListener(topics = { "java-tecie-demo-5" }, groupId = "consumer-group-2")
	public void messageConsumer4(String message) {

		logger.info("Consumer4 consume the message {}", message);

	}

}
