package me.dio.kafkatutorial.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersController {

	@GetMapping
	public ResponseEntity<String> saveOrder() {
		return ResponseEntity.ok("Success");
	}

}
