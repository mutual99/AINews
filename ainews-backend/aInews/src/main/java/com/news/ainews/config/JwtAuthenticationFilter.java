package com.news.ainews.config;

import com.news.ainews.domain.User;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Slf4j
@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    @Autowired
    private TokenProvider tokenProvider;

    @Override
    // 실제 필터링 로직이 구현되는 메서드.
    // 클라이언트로부터 전송된 JWT를 파싱하여 사용자를 인증하고, 해당 사용자의 인증정보를 SecurityContext에 등록
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        // 클라이언트에서 보낸 토큰을 받아서 사용자 확인 후 인증 처리
        String token = parseBearerToken(request);
        log.info("token : " + token);
        if(token!=null && !token.equalsIgnoreCase("null")) {
            // JWT를 생성하고 검증하는 TokenProvider 객체를 주입
            User user = tokenProvider.validateGetUser(token);

            // 추출된 인증 정보를 필터링에 사용할 수 있도록 SecurityContext에 등록
            // Spring Security에서 사용되는 토큰 중 하나로
            // 사용자의 인증 정보를 나타냄. 여기서는 사용자 정보와 권한을 제공하여 토큰을 생성
            AbstractAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(user, user.getPassword(), user.getAuthorities());
            authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

            // Spring Security에서 사용되는 인증된 사용자의 보안 정보를 저장하는 클래스로, SecurityContext를 통해 접근할 수 있다.
            // 이를 사용하여 사용자의 인증 정보를 등록
            SecurityContext securityContext = SecurityContextHolder.createEmptyContext();
            securityContext.setAuthentication(authentication);

            SecurityContextHolder.setContext(securityContext);
        }
        filterChain.doFilter(request, response);
    }

    // HTTP 요청 헤더에서 Bearer 토큰을 추출하는 메서드
    private String parseBearerToken(HttpServletRequest request) {
        String bearerToken = request.getHeader("Authorization");

        if(StringUtils.hasText(bearerToken) && bearerToken.startsWith("Bearer")) {
            return bearerToken.substring(7);
        }

        return null;
    }
}
