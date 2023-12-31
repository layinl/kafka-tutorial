package me.dio.kafkarest.controller;

import lombok.RequiredArgsConstructor;
import me.dio.kafkarest.data.OrderData;
import me.dio.kafkarest.service.RecordEventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class OrdersController {

	private final RecordEventService eventService;

	@PostMapping("/api/save-order")
	public ResponseEntity<String> saveOrder(@RequestBody OrderData order) {
		eventService.addEvent("SaveOrder", order);
		return ResponseEntity.ok("Success");
	}

}
