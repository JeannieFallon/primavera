package com.metatarsal.primavera.models;

public class TextDTO {

    private String plaintext;
    private String ciphertext;
    private int TextLength;
    private int shiftVal;

    public TextDTO() {

    }

    public TextDTO(String plainText, int shiftVal) {
        this.plaintext = plainText;
        this.TextLength = plainText.length();
        this.shiftVal = shiftVal;
    }

    public String getPlaintext() {
        return plaintext;
    }

    public void setPlaintext(String plaintext) {
        this.plaintext = plaintext;
    }

    public String getCiphertext() {
        return ciphertext;
    }

    public void setCiphertext(String ciphertext) {
        this.ciphertext = ciphertext;
    }

    public int getTextLength() {
        return TextLength;
    }

    public int getShiftVal() {
        return shiftVal;
    }
}
