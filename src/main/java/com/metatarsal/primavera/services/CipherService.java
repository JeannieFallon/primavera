package com.metatarsal.primavera.services;

/*
* Service interface for cipher functions
* */
public interface CipherService {

    String getRot13Cipher(String plaintext);
    char shiftChar(char charToShift, int shiftVal);
    int getCipherAscii(int asciiDiffVal, int asciiVal, int shiftVal);
    int getRotation(int alphaIdx, int shiftVal);
}
