package com.example.demo.controller;

import com.example.demo.parser.SimpleArithmeticParser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/arithmetic")
public class ArethmeticController {
    @GetMapping("/parse")
    public String parseExpression(@RequestParam String expression) {
        try {
            SimpleArithmeticParser parser = new SimpleArithmeticParser(new java.io.StringReader(expression));
            SimpleArithmeticParser.Input();
            return "Parsed successfully!";
        } catch (Exception e) {
            return "Parsing failed: " + e.getMessage();
        }
    }
}
