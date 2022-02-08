package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.WordService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UpdateWordController {
    
    private final WordService service;
	
	@GetMapping("/update")
	public void update() {
		service.update(null);
	}
}
