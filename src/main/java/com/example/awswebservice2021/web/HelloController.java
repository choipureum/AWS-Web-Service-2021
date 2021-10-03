package com.example.awswebservice2021.web;

import com.example.awswebservice2021.config.auth.dto.LoginUser;
import com.example.awswebservice2021.config.auth.dto.SessionUser;
import com.example.awswebservice2021.domain.user.User;
import com.example.awswebservice2021.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name
                                    ,@RequestParam("amount") int amount){
        return new HelloResponseDto(name,amount);
    }

    @GetMapping("/hello/user")
    public SessionUser helloDto(@LoginUser SessionUser user){
        return user;
    }
}
