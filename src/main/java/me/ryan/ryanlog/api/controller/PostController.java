package me.ryan.ryanlog.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class PostController {

    @GetMapping(value = "/posts")
    public String get() {
        return HttpStatus.OK.name();
    }
}