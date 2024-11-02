package com.jt.quiz.service.quiz_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jt.quiz.service.quiz_service.model.Quiz;

public interface QuizRepo extends JpaRepository<Quiz, Integer> {

}
