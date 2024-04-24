package com.news.ainews.config;

import com.news.ainews.domain.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Map;

@Service
public class TokenProvider {

    //JWT 서명에 사용될 비밀 키를 생성
    private SecretKey secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS512);
    
    // 주어진 사용자 정보를 기반으로 JWT를 생성.
    // JWT의 내용에는 사용자의 아이디, 이름, 역할(role)이 포함
    public String create(User user) {
        return Jwts.builder()
                .signWith(secretKey)
                .setClaims(Map.of(
                        "id", user.getId(),
                        "name", user.getName(),
                        "role", user.getRole()
                ))
                .setIssuedAt(new Date())
                .setExpiration(Date.from(Instant.now().plus(1, ChronoUnit.DAYS)))
                .compact();
    }
    
    // 주어진 JWT를 검증하고, 해당 토큰의 내용을 기반으로 사용자의 정보를 반환
    // JWT의 내용을 파싱하여 사용자의 아이디, 이름, 역할을 추출하여 사용자 객체로 반환
    public User validateGetUser(String token) {
        Claims claims = Jwts.parser()
                .setSigningKey(secretKey)
                .parseClaimsJws(token).getBody();
        return User.builder()
                .id((String) claims.get("id"))
                .name((String) claims.get("name"))
                .build();
    }

}
