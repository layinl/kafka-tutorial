package me.dio.kafkatutorial.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class WelcomeController {

	@GetMapping
	public ResponseEntity<String> sayWelcome() {
		return ResponseEntity.ok("<h1 style=\"color: #3fff00\">Nice job! The API is working just fine :)</h1>");
	}

}
