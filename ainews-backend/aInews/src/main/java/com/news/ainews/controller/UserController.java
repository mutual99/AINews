package com.news.ainews.controller;

import com.news.ainews.domain.User;
import com.news.ainews.service.UserService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"*"}, maxAge = 6000)
public class UserController {

    @Autowired
    private UserService service;

    // 회원가입
    @PostMapping("/user/register")
    public ResponseEntity registers(@RequestBody User user) {
        user.setRole("ROLE_USER");
        service.addUser(user);
        System.out.println("유저 정보 : " + user.getNickname());
        return ResponseEntity.ok().build();
    }

    // 로그인
    @PostMapping("/user/login")
    public ResponseEntity login(@RequestBody User vo) {
        User result = service.login(vo.getId(), vo.getPassword());
        System.out.println("컨트롤러 로그인 : " + result);
        if(result!=null) {
            System.out.println("컨트롤러 부분 로그인 성공");
            return ResponseEntity.ok().body(result);
        } else {
            System.out.println("컨트롤러 부분 로그인 실패");
            return ResponseEntity.badRequest().build();
        }
    }

    // 수정
    @PutMapping("/user/upduser")
    public ResponseEntity updUser(@RequestBody User user) {
        service.updUser(user);
        return ResponseEntity.ok().build();
    }

    // 삭제
    @DeleteMapping("/user/deluser/{id}")
    public ResponseEntity delUSer(@PathVariable("id") String id) {
        service.delUser(id);
        if(id != null) {
            return ResponseEntity.ok().body(id);
        } else {
            return ResponseEntity.badRequest().body(id);
        }

    }

    // 전체보기
    @GetMapping("/user")
    public ResponseEntity<List<User>> selUsers() {
        List<User> list = service.selects();
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }
    
    // 1명 유저정보 가져오기
    @GetMapping("/user/{id}")
    public ResponseEntity<User> select(@PathVariable("id") String id) {
        User user = service.select(id);
        System.out.println("컨트롤러 1명유저정보 : " + user);
        return ResponseEntity.ok().body(user);
    }
}
