package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.entity.Words;
import com.example.service.WordService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class InsertWordController {
    
	private final WordService service;
	
	@GetMapping("/insert")
	public void insert() {
		Words word = new Words();
		word.setWord("one");
		word.setJapanese("いち");
		service.insert(word);
	}
}
