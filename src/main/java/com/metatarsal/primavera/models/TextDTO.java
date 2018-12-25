package com.metatarsal.primavera.models;

public class TextDTO {

    private String plainText;
    private String cipherText;
    private int TextLength;
    private int shiftVal;

    public TextDTO() {

    }

    public TextDTO(String plainText, int shiftVal) {
        this.plainText = plainText;
        this.TextLength = plainText.length();
        this.shiftVal = shiftVal;
    }

    public String getPlainText() {
        return plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    public String getCipherText() {
        return cipherText;
    }

    public void setCipherText(String cipherText) {
        this.cipherText = cipherText;
    }

    public int getTextLength() {
        return TextLength;
    }

    public int getShiftVal() {
        return shiftVal;
    }
}
