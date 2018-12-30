package com.metatarsal.primavera.models;

public class PrimaveraViewModel {

    private TextDTO text;
    private String title;
    private String instruction;
    private String instructionShift; //TODO fix instruction design
    private String instructionKey;
    private String plainLabel;
    private String cipherLabel;

    public PrimaveraViewModel() {
    }

    public TextDTO getText() {
        return text;
    }

    public void setText(TextDTO text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getInstructionShift() {
        return instructionShift;
    }

    public void setInstructionShift(String instructionShift) {
        this.instructionShift = instructionShift;
    }

    public String getInstructionKey() {
        return instructionKey;
    }

    public void setInstructionKey(String instructionKey) {
        this.instructionKey = instructionKey;
    }

    public String getPlainLabel() {
        return plainLabel;
    }

    public void setPlainLabel(String plainLabel) {
        this.plainLabel = plainLabel;
    }

    public String getCipherLabel() {
        return cipherLabel;
    }

    public void setCipherLabel(String cipherLabel) {
        this.cipherLabel = cipherLabel;
    }
}
