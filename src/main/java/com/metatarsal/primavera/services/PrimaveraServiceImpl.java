package com.metatarsal.primavera.services;

import com.metatarsal.primavera.constants.PrimaveraConstants;
import com.metatarsal.primavera.enums.Context;
import com.metatarsal.primavera.models.PrimaveraViewModel;
import org.springframework.stereotype.Service;

@Service
public class PrimaveraServiceImpl implements PrimaveraService {

    @Override
    public PrimaveraViewModel getPrimaVM(Context context) {
        PrimaveraViewModel primaVM = new PrimaveraViewModel();

        // shared fields
        primaVM.setInstruction(PrimaveraConstants.ENTER_PLAINTEXT);
        primaVM.setInstructionShift(PrimaveraConstants.ENTER_SHIFTVAL);
        primaVM.setPlainLabel(PrimaveraConstants.PLAIN_LABEL);

        // context specific fields
        switch (context) {
            case HOME:
                primaVM = getHomeFields(primaVM);
                break;
            case ROT13:
                primaVM = getRot13Fields(primaVM);
                break;
            case CAESAR:
                primaVM = getCaesarFields(primaVM);
                break;
            case VIGENERE:
                primaVM = getVigenereFields(primaVM);
                break;
            default:
                break;
        }

        return primaVM;
    }

    @Override
    public PrimaveraViewModel getHomeFields(PrimaveraViewModel primaVM) {
        return primaVM;
    }

    @Override
    public PrimaveraViewModel getRot13Fields(PrimaveraViewModel primaVM) {
        primaVM.setTitle(PrimaveraConstants.ROT13_TITLE);
        primaVM.setCipherLabel(PrimaveraConstants.ROT13 + PrimaveraConstants.CIPHER_LABEL);
        return primaVM;
    }

    @Override
    public PrimaveraViewModel getCaesarFields(PrimaveraViewModel primaVM) {
        primaVM.setTitle(PrimaveraConstants.CAESAR_TITLE);
        primaVM.setCipherLabel(PrimaveraConstants.CAESAR + PrimaveraConstants.CIPHER_LABEL);
        return primaVM;
    }

    @Override
    public PrimaveraViewModel getVigenereFields(PrimaveraViewModel primaVM) {
        return primaVM;
    }
}
