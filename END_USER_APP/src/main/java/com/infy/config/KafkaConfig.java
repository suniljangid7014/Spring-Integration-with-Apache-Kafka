package com.infy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

	@KafkaListener(groupId = AppConstant.GROUP_ID, topics = AppConstant.LOCATION_TOPIC_NAME)
	public void updatedLocation(String value) {
		System.out.println(value);
	}

}
