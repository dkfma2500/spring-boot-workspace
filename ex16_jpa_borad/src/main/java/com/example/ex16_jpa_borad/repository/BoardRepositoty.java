package com.example.ex16_jpa_borad.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.ex16_jpa_borad.dto.Board;

import jakarta.transaction.Transactional;

public interface BoardRepositoty extends JpaRepository<Board, Integer>{

    @Modifying
    @Transactional
    @Query("insert into board(writer, title, content) values (:writer, :title, :content)")
    void write(@Param("wroter")String writer, @Param("title")String title, @Param("content")String content);
}
