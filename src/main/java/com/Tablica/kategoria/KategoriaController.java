package com.Tablica.kategoria;

import com.Tablica.uzytkownik.Uzytkownik;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.lang.Long.parseLong;

@CrossOrigin(allowCredentials = "true", origins = "/**")
@RestController
@RequestMapping("api/kategorie")
public class KategoriaController {

    @Autowired
    KategoriaService kategoriaService;

    @Autowired
    KategoriaRepository kategoriaRepository;

    @GetMapping("kategorie")
    @ResponseStatus(HttpStatus.OK)
    public List<Kategoria> getKategorie(){
        return kategoriaService.getKategorie();
    }


    @GetMapping("kategoria")
    @ResponseStatus(HttpStatus.OK)
    public Kategoria findFirstById(
            @RequestParam String id
    ){
        Kategoria category = kategoriaRepository.findFirstById(parseLong(id));
        if(category != null) {
            return category;
        }
        else return new Kategoria();
    }
}
