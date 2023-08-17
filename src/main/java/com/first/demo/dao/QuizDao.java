package com.first.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.first.demo.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
	
}
