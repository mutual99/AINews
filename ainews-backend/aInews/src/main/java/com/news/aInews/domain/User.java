package com.news.aInews.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private int no;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String nickname;
    @Column
    private String password;

}
