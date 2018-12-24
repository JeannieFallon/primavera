package com.metatarsal.primavera.controllers;

import com.metatarsal.primavera.constants.PrimaveraConstants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("vigenere")
public class VigenereController {

    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("title", PrimaveraConstants.VIGENERE_TITLE);
        return "vigenere/index";
    }
}
