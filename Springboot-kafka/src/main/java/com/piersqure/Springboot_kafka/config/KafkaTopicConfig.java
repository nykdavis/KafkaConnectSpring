package com.piersqure.Springboot_kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
	
	
	public NewTopic piersqureTopic() {
		return TopicBuilder.name("piersqure")
				.build();
	}

}
