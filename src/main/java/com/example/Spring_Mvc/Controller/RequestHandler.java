package com.example.Spring_Mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class RequestHandler {

    @GetMapping("/mypage")
    public String myMethod(){
        return "display";

    }
}
