package com.metatarsal.primavera.constants;

public class PrimaveraConstants {

    /*
    * standard values for page names & flows
    * throughout Primavera app
    * */

    private PrimaveraConstants() {

    }

    //region cipher names
    public static final String ROT13 = "ROT13";
    public static final String CAESAR = "Caesar";
    public static final String VIGENERE = "Vigenere";
    //endregion

    //region viewmodel fields
    public static final String HOME_TITLE = "Home";
    public static final String ROT13_TITLE = "ROT13 Cipher";
    public static final String CAESAR_TITLE = "Caesar Cipher";
    public static final String VIGENERE_TITLE = "Vigenere Cipher";
    public static final String PLAIN_LABEL = "Plaintext:";
    public static final String CIPHER_LABEL = " ciphertext:";
    public static final String ENTER_PLAINTEXT = "Please enter the plaintext below.";
    //endregion

    //region model bindings & request params
    public static final String PRIMA_VM = "primaVM";
    public static final String PLAINTEXT = "plaintext";
    //endregion
}
