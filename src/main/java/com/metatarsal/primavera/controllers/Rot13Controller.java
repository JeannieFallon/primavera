package com.metatarsal.primavera.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("rot13")
public class Rot13Controller {

    @RequestMapping(value = "")
    @ResponseBody
    public String index() {
        return "Rot13 page";
    }
}
