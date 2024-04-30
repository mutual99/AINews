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
    public void addBoard(Board board) {
        dao.save(board);
    }

    // 수정
    public void updBoard(Board board) {
        if(dao.existsById(board.getNo())) {
            dao.save(board);
        }
    }

    // 삭제
    public void delBoard(int no) {
        if(dao.existsById(no)) {
            dao.deleteById(no);
        }
    }

    // 전체보기
    public List<Board> selects() {
        return dao.findAll();
    }
    
    // 1개 보기
    public Board selct(int no) {
        return dao.findById(no).orElse(null);
    }
}
