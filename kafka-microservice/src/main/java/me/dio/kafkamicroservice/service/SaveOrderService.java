package me.dio.kafkamicroservice.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import me.dio.kafkamicroservice.model.OrderData;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SaveOrderService {

	@KafkaListener(topics = "SaveOrder", groupId = "MicroserviceSaveOrder")
	private void execute(ConsumerRecord<String, String> record) {
		log.info("Key : {}", record.key());
		log.info("Headers : {}", record.headers());
		log.info("Partition : {}", record.partition());

		String data = record.value();
		ObjectMapper mapper = new ObjectMapper();
		OrderData order;

		try {
			order = mapper.readValue(data, OrderData.class);
		} catch (JsonProcessingException ex) {
			log.error("Failed to convert event [data : {}]", data, ex);
			return;
		}

		log.info("Event received : {}", order);

		// TODO: Save in DB
		// TODO: Return to the queue that the order was saved

	}

	private void save(OrderData order) {
		// TODO: Save in DB
	}

}
