package com.example.ex30_jpa_qnaboard_rest_api;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {

}