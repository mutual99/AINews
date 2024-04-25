package com.news.ainews.repo;

import com.news.ainews.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostDAO extends JpaRepository<Post, Long> {
}
