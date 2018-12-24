package com.metatarsal.primavera.controllers;

import com.metatarsal.primavera.constants.PrimaveraConstants;
import com.metatarsal.primavera.services.CipherServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("rot13")
public class Rot13Controller {

    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute(PrimaveraConstants.INSTRUCTION, PrimaveraConstants.ENTER_PLAINTEXT);
        model.addAttribute(PrimaveraConstants.TITLE, PrimaveraConstants.ROT13_TITLE);
        return "rot13/index";
    }

    @RequestMapping(value = "cipher", method = RequestMethod.POST)
    public String getRot13Cipher(Model model, HttpServletRequest request) {

        //TODO proper dependency injection
        CipherServiceImpl cipherService = new CipherServiceImpl();

        String plaintext = request.getParameter(PrimaveraConstants.PLAINTEXT);
        String ciphertext = cipherService.getRot13Cipher(plaintext);

        //TODO add Text object as model
        model.addAttribute(PrimaveraConstants.PLAINTEXT_LABEL, PrimaveraConstants.PLAINTEXT_DISPLAY);
        model.addAttribute(PrimaveraConstants.CIPHERTEXT_LABEL, PrimaveraConstants.CIPHERTEXT_DISPLAY);
        model.addAttribute(PrimaveraConstants.PLAINTEXT, plaintext);
        model.addAttribute(PrimaveraConstants.CIPHERTEXT, ciphertext);
        model.addAttribute(PrimaveraConstants.TITLE, PrimaveraConstants.ROT13_TITLE);
        return "rot13/cipher";
    }
}
