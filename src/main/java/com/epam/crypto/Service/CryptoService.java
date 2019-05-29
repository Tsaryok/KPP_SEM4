package com.epam.crypto.Service;

import com.epam.crypto.Entity.Crypto;

public class CryptoService {


    public CryptoService() {
    }

    public Crypto buildCrypto(String text){
        Crypto crypto = new Crypto(text);
        encryptText(crypto);
        return crypto;
    }

    private void encryptText(Crypto crypto){
        String bufEncrypted = new StringBuffer(crypto.getText()).reverse().toString();
        char[] charSequence = bufEncrypted.toCharArray();
        for (int i = 0; i< charSequence.length; i++)
        {
            if(charSequence[i] >= '0' && charSequence[i] <= '9')
                charSequence[i] = (char) ('9' - charSequence[i] + '0');
        }
        bufEncrypted = String.valueOf(charSequence);
        crypto.setEncryptedText(bufEncrypted);
    }
}
