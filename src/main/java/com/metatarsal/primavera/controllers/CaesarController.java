package com.metatarsal.primavera.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("caesar")
public class CaesarController {

    @RequestMapping(value ="")
    public String index() {
        return "caesar/index";
    }
}
