package com.news.ainews.service;

import com.news.ainews.domain.Board;
import com.news.ainews.repo.BoardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardDAO dao;
    
    
    // 작성
    public void write(Board board) {
        dao.save(board);
    }

    // 수정
    public void updwrite(Board board) {
        if(dao.existsById(board.getNo())) {
            dao.save(board);
        }
    }

    // 삭제
    public void delwrite(int no) {
        if(dao.existsById(no)) {
            dao.deleteById(no);
        }
    }
    
    // 보기
    public Board select(int no) {
        return dao.findById(no).orElse(null);
    }
    
    // 전체 보기
    public List<Board> select () {
        return dao.findAll();
    }
}
