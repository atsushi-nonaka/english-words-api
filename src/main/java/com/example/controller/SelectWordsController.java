package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.entity.Words;
import com.example.service.WordService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class SelectWordsController {
    
	private final WordService service;
	
	@GetMapping("/select_words")
	public List<Words> select() {
		List<Words> wordList = service.selectWords();
		return wordList;
	}
}
