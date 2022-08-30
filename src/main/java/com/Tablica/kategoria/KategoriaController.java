package com.Tablica.kategoria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/kategorie")
public class KategoriaController {

    @Autowired
    KategoriaService kategoriaService;

    @RequestMapping("kategorie")
    @ResponseStatus(HttpStatus.OK)
    public List<Kategoria> getKategorie(){
        return kategoriaService.getKategorie();
    }


}
