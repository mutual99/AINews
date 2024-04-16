package com.news.aInews.controller;

import com.news.aInews.domain.User;
import com.news.aInews.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/*")
public class UserController {

    @Autowired
    private UserService service;

    // 추가
    @PostMapping("/user")
    public ResponseEntity insert(@RequestBody User user) {
        service.insert(user);
        return ResponseEntity.ok().build();
    }

    // 수정
    @PutMapping("/user")
    public ResponseEntity update(@RequestBody User user) {
        service.update(user);
        return ResponseEntity.ok().build();
    }

    // 삭제
    @DeleteMapping("/user/{no}")
    public ResponseEntity delete(@PathVariable(name = "no") int no) {
        service.delete(no);
        return ResponseEntity.ok().build();
    }

    // 1개 보기
    @GetMapping("/user/{no}")
    public ResponseEntity select(@PathVariable(name = "no") int no) {
        return ResponseEntity.ok(service.select(no));
    }

    // 전체보기
    @GetMapping("/user")
    public ResponseEntity select() {
        return ResponseEntity.ok(service.select());
    }

}
