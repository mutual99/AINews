package com.news.ainews.controller;

import com.news.ainews.config.TokenProvider;
import com.news.ainews.domain.User;
import com.news.ainews.domain.UserDTO;
import com.news.ainews.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"*"}, maxAge = 6000)
public class UserController {

    @Autowired
    private UserService service;

    // 사용자 토큰 생성을 담당하는 클래스로, 이를 사용하여 로그인 후에 토큰을 생성
    @Autowired
    private TokenProvider tokenProvider;
    
    // 비밀번호 암호화를 담당하는 인터페이스로, 'BCryptPasswordEncoder'를 
    // 사용하여 사용자의 비밀번호를 해싱
    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    
    // 회원가입
    // 클라이언트로부터 받은 사용자 정보를 이용하여 새로운 사용자를 생성하고,
    // 그 결과를 클라이언트에게 반환
    // ResponseEntity : HTTP 응답을 나타내는 객체로, 상태 코드와 응답 본문을 포함
    @PostMapping("/signUp")
    public ResponseEntity create(@RequestBody User vo) {
        User user = User.builder()
                .id(vo.getId())
                .password(passwordEncoder.encode((vo.getPassword())))
                .name(vo.getName())
                .nickname(vo.getNickname())
                .role("ROLE_USER")
                .build();

        User result = service.create(user);
        UserDTO responseDTO = UserDTO.builder()
                .id(result.getId())
                .name(result.getName())
                .build();
        return ResponseEntity.ok().body(responseDTO);
    }
    
    // 로그인
    // 클라이언트로부터 받은 아이디와 비밀번호를 사용하여 사용자를 인증하고,
    // 성공하면 토큰을 생성하여 클라이언트에 반환
    @PostMapping("/login")
    public ResponseEntity login(@RequestBody User vo) {
        User user = service.login(vo.getId(), vo.getPassword(), passwordEncoder);
        if(user!=null) {
            // 로그인 성공 -> 토큰 생성
            String token = tokenProvider.create(user);
            UserDTO responseDTO = UserDTO.builder()
                    .id(user.getId())
                    .name(user.getName())
                    .token(token)
                    .build();
            return ResponseEntity.ok().body(responseDTO);
        }
        // 로그인 실패
        return ResponseEntity.badRequest().build();
    }

}
