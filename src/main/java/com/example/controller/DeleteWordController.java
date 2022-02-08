package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.WordService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class DeleteWordController {
	
	private final WordService service;
	
	@GetMapping("/delete")
	public void delete() {
		service.delete(1);
	}

}
