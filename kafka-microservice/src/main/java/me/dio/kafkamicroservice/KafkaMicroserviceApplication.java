package me.dio.kafkamicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class KafkaMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaMicroserviceApplication.class, args);
	}

}
