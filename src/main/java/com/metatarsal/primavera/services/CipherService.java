package com.metatarsal.primavera.services;

import com.metatarsal.primavera.models.TextDTO;
import org.springframework.stereotype.Service;

/*
* Service interface for cipher functions
* */
@Service
public interface CipherService {

    TextDTO getRot13Cipher(TextDTO text);
    char shiftChar(char charToShift, int shiftVal);
    int getCipherAscii(int asciiDiffVal, int asciiVal, int shiftVal);
    int getRotation(int alphaIdx, int shiftVal);
}
