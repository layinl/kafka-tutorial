package me.dio.kafkarest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class KafkaRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaRestApplication.class, args);
	}

}