package com.epam.crypto.Entity;

import com.sun.xml.internal.fastinfoset.stax.factory.StAXOutputFactory;

public class Crypto {
    private String text;
    private String encryptedText;

    public Crypto() {
    }

    public Crypto(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getEncryptedText() {
        return encryptedText;
    }

    public void setEncryptedText(String encryptedText) {
        this.encryptedText = encryptedText;
    }
}
