package com.metatarsal.primavera.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("vigenere")
public class VigenereController {

    @RequestMapping(value = "")
    public String index() {
        return "vigenere/index";
    }
}
