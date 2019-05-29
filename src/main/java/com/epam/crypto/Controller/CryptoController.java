package com.epam.crypto.Controller;

import com.epam.crypto.Entity.Crypto;
import com.epam.crypto.Service.CryptoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CryptoController {
    private CryptoService service = new CryptoService();

//    public CryptoController(CryptoService service) {
//        this.service = service;
//    }

    @RequestMapping("/crypt")
    public Crypto createCrypt(@RequestParam(value = "crypt", defaultValue = "qwerty123") String textToEncrypt){
        return service.buildCrypto(textToEncrypt);
    }
}
