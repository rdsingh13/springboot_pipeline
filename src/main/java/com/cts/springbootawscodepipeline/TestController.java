package com.cts.springbootawscodepipeline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class TestController {

    @GetMapping("/data")
    public String getData() {
        return "First msg from aws";
    }

//    @GetMapping("/hello")
//    public String getHello() {
//        return "First message from GitHub Actions";
//    }
}
