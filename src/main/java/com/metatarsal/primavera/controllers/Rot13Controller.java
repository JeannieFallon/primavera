package com.metatarsal.primavera.controllers;

import com.metatarsal.primavera.constants.CipherConstants;
import com.metatarsal.primavera.constants.PrimaveraConstants;
import com.metatarsal.primavera.models.PrimaveraViewModel;
import com.metatarsal.primavera.models.TextDTO;
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
        //TODO get viewmodel in service w/ session store
        PrimaveraViewModel primaVM = new PrimaveraViewModel();
        primaVM.setTitle(PrimaveraConstants.ROT13_TITLE);
        primaVM.setInstruction(PrimaveraConstants.ENTER_PLAINTEXT);
        model.addAttribute(PrimaveraConstants.PRIMA_VM, primaVM);
        return "rot13/index";
    }

    @RequestMapping(value = "cipher", method = RequestMethod.POST)
    public String getRot13Cipher(Model model, HttpServletRequest request) {
        //TODO proper dependency injection
        CipherServiceImpl cipherService = new CipherServiceImpl();

        //TODO get viewmodel in service w/ session store
        PrimaveraViewModel primaVM = new PrimaveraViewModel();
        primaVM.setTitle(PrimaveraConstants.ROT13_TITLE);
        primaVM.setPlainLabel(PrimaveraConstants.PLAIN_LABEL);
        primaVM.setCipherLabel(PrimaveraConstants.ROT13 + PrimaveraConstants.CIPHER_Label);
        // get cipher text
        TextDTO text = new TextDTO(request.getParameter(PrimaveraConstants.PLAINTEXT), CipherConstants.ROT13_SHIFT_VAL);
        text = cipherService.getRot13Cipher(text);
        primaVM.setText(text);

        model.addAttribute(PrimaveraConstants.PRIMA_VM, primaVM);

        return "rot13/cipher";
    }

}
