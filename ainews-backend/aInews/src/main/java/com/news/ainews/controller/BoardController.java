package com.news.ainews.controller;

import com.news.ainews.domain.Board;
import com.news.ainews.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/public/*")
@CrossOrigin(origins = {"*"}, maxAge = 6000)
public class BoardController {

    @Autowired
    private BoardService service;

    // 추가
    @PostMapping("/board/addwrite")
    public ResponseEntity write(@RequestBody Board board) {
        service.write(board);
        return ResponseEntity.ok().build();
    }

    // 수정
    @PutMapping("/board/updwrite")
    public ResponseEntity updwrite(@RequestBody Board board) {
        service.updwrite(board);
        return ResponseEntity.ok().build();
    }

    // 삭제
    @DeleteMapping("/board/delwrite/{no}")
    public ResponseEntity delwrite(@PathVariable("no") int no) {
        service.delwrite(no);
        return ResponseEntity.ok().build();
    }
    
    // 전체보기
    @GetMapping("/board")
    public ResponseEntity<List<Board>> selectwrite() {
        List<Board> list = service.select();
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }
    
    // 1개 보기
    @GetMapping("/board/{no}")
    public ResponseEntity<Board> selectwrite(@PathVariable("no") int no) {
        Board board = service.select(no);
        return ResponseEntity.status(HttpStatus.OK).body(board);
    }
}
