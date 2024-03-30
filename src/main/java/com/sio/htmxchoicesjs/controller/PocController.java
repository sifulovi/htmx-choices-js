package com.sio.htmxchoicesjs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PocController {

    @GetMapping("")
    public String index(Model model) {
        return "/index";
    }

    @GetMapping("/getTwo")
    public String getTwo(Model model) {
        return "/two";
    }

    @GetMapping("/getThree")
    public String getThree(Model model) {
        return "/three";
    }

}