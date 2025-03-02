package com.cloudintro.ollama.ai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexPageController {

    // Create a method to open index.html file
    @GetMapping(value = {"/", "/index"})
    public String index() {
        return "index";
    }

    @GetMapping("/error")
    public String error() {
        return "Error occurred while opening chat window";
    }
}
