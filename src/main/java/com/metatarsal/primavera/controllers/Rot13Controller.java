package com.metatarsal.primavera.controllers;

import com.metatarsal.primavera.constants.CipherConstants;
import com.metatarsal.primavera.constants.PrimaveraConstants;
import com.metatarsal.primavera.enums.Context;
import com.metatarsal.primavera.models.PrimaveraViewModel;
import com.metatarsal.primavera.models.TextDTO;
import com.metatarsal.primavera.services.CipherServiceImpl;
import com.metatarsal.primavera.services.PrimaveraServiceImpl;
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
        PrimaveraServiceImpl primaService = new PrimaveraServiceImpl();
        PrimaveraViewModel primaVM = primaService.getPrimaVM(Context.ROT13);
        model.addAttribute(PrimaveraConstants.PRIMA_VM, primaVM);
        return "rot13/index";
    }

    @RequestMapping(value = "cipher", method = RequestMethod.POST)
    public String getRot13Cipher(Model model, HttpServletRequest request) {
        //TODO proper dependency injection
        PrimaveraServiceImpl primaService = new PrimaveraServiceImpl();
        CipherServiceImpl cipherService = new CipherServiceImpl();

        PrimaveraViewModel primaVM = primaService.getPrimaVM(Context.ROT13);
        TextDTO text = new TextDTO(request.getParameter(PrimaveraConstants.PLAINTEXT), CipherConstants.ROT13_SHIFT_VAL);
        text = cipherService.getRot13Cipher(text);
        primaVM.setText(text);

        model.addAttribute(PrimaveraConstants.PRIMA_VM, primaVM);

        return "rot13/cipher";
    }

}
