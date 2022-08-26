package com.Tablica.kategoria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class KategoriaController {

    @Autowired
    KategoriaService kategoriaService;

}
