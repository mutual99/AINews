package com.news.ainews.service;

import com.news.ainews.domain.User;
import com.news.ainews.repo.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDAO dao;

    // 회원가입
    public void addUser(User user) {
        dao.save(user);
    }

    // 로그인
    public User login(String id, String password) {
        User user = dao.findById(id).orElse(null);
        if(id.equals(user.getId()) && password.equals(user.getPassword())) {
            System.out.println("서비스 부분 로그인 성공");
            return user;
        } else {
            System.out.println("서비스 부분 로그인 실패");
            return null;
        }
    }

    // 수정
    public void updUser(User user) {
        if(dao.existsById(user.getId())) {
            dao.save(user);
        }
    }

    // 삭제
    public void delUser(String id) {
        if(dao.existsById(id)) {
            dao.deleteById(id);
        }
    }

    // 1개 보기
    public User select(String id) {
        System.out.println("유저 서비스 : " + id);
        return dao.findById(id).orElse(null);
    }

    // 전체보기
    public List<User> selects() {
        return dao.findAll();
    }
}
