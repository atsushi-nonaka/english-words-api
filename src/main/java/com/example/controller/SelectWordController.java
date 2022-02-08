package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.entity.Words;
import com.example.service.WordService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class SelectWordController {
    
	private final WordService service;
	
	@GetMapping("/select_word")
	public Words select() {
		Words word = service.selectWord();
		return word;
	}
}
