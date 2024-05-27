package com.news.ainews.controller;

import com.news.ainews.domain.Board;
import com.news.ainews.service.BoardService;
import com.news.ainews.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"*"}, maxAge = 6000)
public class BoardController {

    @Autowired
    private BoardService boardService;

    // 작성
    @PostMapping("/board/addboard")
    public ResponseEntity addboard(@RequestBody Board board) {
        boardService.addBoard(board);
        System.out.println("게시판 추가작성 : " + board);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    // 수정
    @PutMapping("/board/updboard")
    public ResponseEntity updboard(@RequestBody Board board) {
        boardService.updBoard(board);
        return ResponseEntity.ok().build();
    }

    // 삭제
    @DeleteMapping("/board/delboard/{no}")
    public ResponseEntity delboard(@PathVariable("no") int no) {
        boardService.delBoard(no);
        return ResponseEntity.ok().build();
    }

    // 1개 보기
    @GetMapping("/board/{no}")
    public ResponseEntity select(@PathVariable("no") int no) {
        return ResponseEntity.ok().body(boardService.selct(no));
    }

    // 전체보기
    @GetMapping("/board")
    public ResponseEntity selects(){
        return ResponseEntity.ok().body( boardService.selects());
    }

}
