package com.metatarsal.primavera.services;

import com.metatarsal.primavera.constants.CipherConstants;
import com.metatarsal.primavera.models.TextDTO;

public class CipherServiceImpl implements CipherService {

    public CipherServiceImpl() {

    }

    @Override
    public TextDTO getRot13Cipher(TextDTO text) {
        StringBuffer sb = new StringBuffer();
        for (char currChar : text.getPlaintext().toCharArray()) {
            sb.append(shiftChar(currChar, CipherConstants.ROT13_SHIFT_VAL));
        }
        text.setCiphertext(sb.toString());
        return text;
    }

    @Override
    public char shiftChar(char charToShift, int shiftVal) {
        int asciiVal = (int)charToShift;

        // only shift upper or lower case letters in text
        if (asciiVal >= CipherConstants.ENG_LOWER_FLOOR && asciiVal <= CipherConstants.ENG_LOWER_CEILING) {
            asciiVal = getCipherAscii(CipherConstants.ENG_LOWER_FLOOR, asciiVal, shiftVal);
        } else if (asciiVal >= CipherConstants.ENG_UPPER_FLOOR && asciiVal <= CipherConstants.ENG_UPPER_CEILING) {
            asciiVal = getCipherAscii(CipherConstants.ENG_UPPER_FLOOR, asciiVal, shiftVal);
        }

        return (char)asciiVal;
    }

    @Override
    public int getCipherAscii(int asciiDiffVal, int asciiVal, int shiftVal) {
        // map ASCII value onto index of letter in alphabet
        int alphaIdx = asciiVal - asciiDiffVal;
        // wrap rotation around alphabet indices
        alphaIdx = getRotation(alphaIdx, shiftVal);
        // return to original ASCII range
        return alphaIdx + asciiDiffVal;
    }

    @Override
    public int getRotation(int alphaIdx, int shiftVal) {
        return (alphaIdx + shiftVal) % CipherConstants.ENG_ALPHA_LEN;
    }
}
