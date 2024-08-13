package com.example.ex16_jpa_borad.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ex16_jpa_borad.dto.Board;
import com.example.ex16_jpa_borad.repository.BoardRepositoty;

@Service
public class BoardService {
    @Autowired
    private BoardRepositoty boardRepositoty;

    public List<Board> list() {
        return boardRepositoty.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

    public Board view(int id) {
        return boardRepositoty.findById(id).orElse(null);
    }

    public void write(String writer, String title, String content) {
        Board board = new Board();

        board.setWriter(writer);
        board.setTitle(title);
        board.setContent(content);

        boardRepositoty.save(board);
    }

    public void delete(int id) {
        boardRepositoty.deleteById(id);
    }
    
}
