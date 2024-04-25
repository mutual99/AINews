package com.news.ainews.service;

import com.news.ainews.domain.Post;
import com.news.ainews.repo.PostDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostDAO dao;

    public List<Post> getAllPosts() {
        return dao.findAll();
    }

    public Post getPostById(Long id) {
        return dao.findById(id).orElse(null);
    }

    public Post createPost(Post post) {
        return dao.save(post);
    }

    public void deletePost(Long id) {
        dao.deleteById(id);
    }
}
