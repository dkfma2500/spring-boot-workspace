package com.example.ex18_mybatis_result_num.dao;
import java.util.Map;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.ex18_mybatis_result_num.dto.BoardDTO;

@Mapper
public interface BoardDAO {
    public List<BoardDTO> listDAO();
    public BoardDTO viewDAO(String id);
    public int writeDAO(Map<String, String>map);
     public int deleteDAO(@Param("_id")String id);
     public int articleCount();

 }
