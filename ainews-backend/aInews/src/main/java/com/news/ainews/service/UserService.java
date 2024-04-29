package com.news.ainews.service;

import com.news.ainews.domain.User;
import com.news.ainews.repo.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserDAO dao;

    // 회원가입
    public User create(User user) {
        return dao.save(user);
    }
    
    // 로그인
    // 주어진 아이디(id)를 사용하여 데이터베이스에서 해당 사용자를 검색하고, 패스워드를 검증하기 위해
    // PasswordEncoder를  사용하여 주어진 비밀번호(password) 해싱하여 저장된 패스워드와 비교
    // 만약 사용자가 존재하고 비밀번호가 일치하면 해당 사용자 객체를 반환하고, 그렇지 않다면 null를 반환
    public User login(String id, String password, PasswordEncoder encoder) {
        User user = dao.findById(id).orElse(null);
        if(user!=null && encoder.matches(password, user.getPassword())) {
            return user;
        }
        return null;
    }

    public void deleteUser(String id, String password, PasswordEncoder encoder) {
        User user = dao.findById(id).orElse(null);
        if (user != null && encoder.matches(password, user.getPassword())) {
            dao.delete(user);
        } else {
            throw new RuntimeException("아이디 또는 비밀번호가 틀림");
        }
    }
}