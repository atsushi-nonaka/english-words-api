package com.example.service;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.example.dao.WordsMapper;
import com.example.dao.entity.Words;
import com.example.dao.entity.WordsExample;
import com.example.setting.LogMessages;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class WordService {
    
	private final WordsMapper mapper;
	private final LogMessages messages;
	
	public void insert(Words word) {
		log.info(messages.getInsertStart());
		long startTime = System.currentTimeMillis();
		
		mapper.insert(word);
		log.info(messages.getInsertEnd(), System.currentTimeMillis() - startTime);
	}
	
	public Words selectWord() {
		log.info(messages.getSelectStart());
		long startTime = System.currentTimeMillis();
		
		Random rand = new Random();
		Integer id = rand.nextInt(100) + 1;
		
		Words word = mapper.selectByPrimaryKey(id);
		
		log.info(messages.getSelectEnd(), System.currentTimeMillis() - startTime);
		return word;
	}
	
	public List<Words> selectWords() {
		log.info(messages.getSelectStart());
		long startTime = System.currentTimeMillis();
		
		WordsExample example = new WordsExample();
		List<Words> wordList = mapper.selectByExample(example);
		
		log.info(messages.getSelectEnd(), System.currentTimeMillis() - startTime);
		return wordList;
	}
	
	public void update(Words word) {
		log.info(messages.getUpdateStart());
		long startTime = System.currentTimeMillis();
		
		mapper.updateByPrimaryKey(word);
		log.info(messages.getSelectEnd(), System.currentTimeMillis() - startTime);
	}
	
	public void delete(Integer id) {
		log.info(messages.getUpdateStart());
		long startTime = System.currentTimeMillis();
		
		mapper.deleteByPrimaryKey(id);
		log.info(messages.getSelectEnd(), System.currentTimeMillis() - startTime);
	}
}
