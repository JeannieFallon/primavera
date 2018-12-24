package com.metatarsal.primavera.controllers;

import com.metatarsal.primavera.constants.PrimaveraConstants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("caesar")
public class CaesarController {

    @RequestMapping(value ="")
    public String index(Model model) {
        model.addAttribute("title", PrimaveraConstants.CAESAR_TITLE);
        return "caesar/index";
    }
}
