package com.nowcoder.community.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alpha")
public class AlphaController {
    @RequestMapping("hello")
    public String sayHello(){
        return "hello word";
    }
}
