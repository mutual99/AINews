package com.news.ainews.config;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.filter.CorsFilter;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    @Autowired
    private JwtAuthenticationFilter jwtAuthenticationFilter;

    // 특정 HTTP 요청에 대한 웹 기반 보안 구성. 인증/인가 및 로그아웃 설정
    // filterChain(HttpSecurity http) : HTTP 요청에 대한 보안 설정을 정의
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
                .csrf(csrf -> csrf.disable())   // CSRF 공격 방지를 비활성화
                .httpBasic(basic -> basic.disable())    // HTTP 기본 인증을 비활성화
                .sessionManagement(session ->
                        session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)  // 세션 관리 정책을 설정하여 세션을 사용하지 않도록 구성
                )
                // HTTP 요청에 대한 인가 규칙을 정의
                .authorizeHttpRequests(authorize ->
                        authorize
                                // 아래 경로는 모든 사용자에게 허용
                                .requestMatchers("/signUp", "/login", "/api/public/**", "/board/write").permitAll()
                                // '/api/product' 경로는 USER 역할을 가진 사용자에게만 허용
                                // 그외의 모든 요청은 인증이 필요
                                .requestMatchers("/api/product").hasRole("USER")
                                .anyRequest().authenticated()
                )
                // JWT 인증 필터를 CorsFilter 이후에 추가
                .addFilterAfter(jwtAuthenticationFilter, CorsFilter.class)
                .build();
    }

}
