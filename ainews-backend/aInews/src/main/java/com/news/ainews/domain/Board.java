package com.news.ainews.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Board {

    @Id
    private int no;

    @Column
    private String category;

    @Column
    private String nickname;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    private Date date;
}
