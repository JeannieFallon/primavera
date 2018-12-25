package com.metatarsal.primavera.constants;

public class PrimaveraConstants {

    /*
    * standard values for page names & flows
    * throughout Primavera app
    * */

    private PrimaveraConstants() {

    }

    //region Page Titles
    public static final String HOME_TITLE = "Home";
    public static final String ROT13_TITLE = "ROT13 Cipher";
    public static final String CAESAR_TITLE = "Caesar Cipher";
    public static final String VIGENERE_TITLE = "Vigenere Cipher";
    //endregion

    //region Ciphers
    public static final String ROT13 = "ROT13";
    public static final String CAESAR = "Caesar";
    public static final String VIGENERE = "Vigenere";
    //endregion

    //region model bindings & request params
    public static final String TEXT = "text";
    public static final String PRIMA_VM = "primaVM";
    public static final String PLAINTEXT = "plaintext";
    //endregion

    //region instructions & labels
    public static final String ENTER_PLAINTEXT = "Please enter the plaintext below.";
    public static final String PLAIN_LABEL = "Plaintext:";
    public static final String CIPHER_Label = " ciphertext:";
    //endregion
}
