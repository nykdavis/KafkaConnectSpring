package com.piersqure.Springboot_kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
	
	@Bean
	public NewTopic piersqureTopic() {
		return TopicBuilder.name("piersqure")
				.build();
	}
	
	@Bean
	public NewTopic piersqureJsonTopic() {
		return TopicBuilder.name("piersqure_JSON")
				.build();
	}

}
