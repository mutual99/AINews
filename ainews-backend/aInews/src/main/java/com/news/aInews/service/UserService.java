package com.news.aInews.service;

import com.news.aInews.domain.User;
import com.news.aInews.repo.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDAO dao;
    
    // 추가
    public void insert(User user) {
        dao.save(user);
    }
    
    // 수정
    public void update(User user) {
        if(dao.existsById(user.getNo())) {
            dao.save(user);
        }
    }
    
    // 삭제
    public void delete(int no) {
        if(dao.existsById(no)) {
            dao.deleteById(no);
        }
    }
    
    // 1개 보기
    public User select(int no) {
        return dao.findById(no).orElse(null);
    }

    // 전체보기
    public List<User> select() {
        return dao.findAll();
    }
}
