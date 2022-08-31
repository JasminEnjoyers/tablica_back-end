package com.Tablica.ogloszenie;

import com.Tablica.kategoria.KategoriaRepository;
import com.Tablica.uzytkownik.UzytkownikRepository;
import com.Tablica.uzytkownik.UzytkownikService;
import com.Tablica.kategoria.KategoriaService;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.lang.Long.parseLong;

@CrossOrigin(allowCredentials = "true", origins = "/**")
@RestController
@RequestMapping("api/posty")
public class OgloszenieController {
    private Gson gson = new GsonBuilder().create();

    @Autowired
    OgloszenieService ogloszenieService;

    @Autowired
    UzytkownikRepository uzytkownikRepository;

    @Autowired
    KategoriaRepository kategoriaRepository;


    @GetMapping("posty")
    @ResponseStatus(HttpStatus.OK)
    public List<Ogloszenie> getOgloszenia(
            @RequestParam(name = "kategoria", required = false) String nazwaKategorii,
            @RequestParam(name = "uzytkownik", required = false) String nazwaUzytkownika
    ) {
        if (nazwaKategorii == null && nazwaUzytkownika == null) {
            return ogloszenieService.getOgloszenia();
        }
        if (nazwaKategorii != null && nazwaUzytkownika == null) {
            return ogloszenieService.getOgloszeniaByKategoria(kategoriaRepository.findFirstByNazwa(nazwaKategorii));
        }
        if (nazwaKategorii == null && nazwaUzytkownika != null) {
            return ogloszenieService.getOgloszeniaByUzytkownik(uzytkownikRepository.findFirstByNazwa(nazwaUzytkownika));
        }
        return null;
    }
}