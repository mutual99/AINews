package com.news.ainews.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User implements UserDetails {

    @Id
    private String id;
    @Column
    private String password;
    @Column
    private String name;
    @Column
    private String nickname;
    @Column
    private String role;    // 권한 관련 컬럼

    // 사용자의 권한 정보를 제공
    // 사용자의 역할(role)를 기반으로 SimpleGrantedAuthority를 생성하여 반환
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        ArrayList<GrantedAuthority> authList = new ArrayList<GrantedAuthority>();
        authList.add(new SimpleGrantedAuthority(role));
        return authList;
    }
    
    // 사용자의 아이디(id)를 반환
    @Override
    public String getUsername() {
        return id;
    }
    
    // 계정의 만료 여부
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    
    // 잠긴 계정 여부
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    
    // 자격 증명(패스워드)의 만료 여부
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    
    // 계정 활성화 여부
    @Override
    public boolean isEnabled() {
        return true;
    }
}
