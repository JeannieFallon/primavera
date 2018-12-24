package com.metatarsal.primavera.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("vigenere")
public class VigenereController {

    @RequestMapping(value = "")
    @ResponseBody
    public String index() {
        return "Vigenere page";
    }
}
