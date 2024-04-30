package com.news.ainews.repo;

import com.news.ainews.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardDAO extends JpaRepository<Board, Integer> {
}
