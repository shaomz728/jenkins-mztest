package com.mingzheng.mztest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class mzcontroller {
    @GetMapping("mztest")
    public String mztest() {
        return "mztest jenkins ! -- V3.0.0";
    }
}
