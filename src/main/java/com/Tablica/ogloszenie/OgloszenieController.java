package com.Tablica.ogloszenie;

import com.Tablica.uzytkownik.UzytkownikService;
import com.Tablica.kategoria.KategoriaService;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(allowCredentials = "true", origins = "/**")
@RestController
@RequestMapping("api/")
public class OgloszenieController {
    private Gson gson = new GsonBuilder().create();

    @Autowired
    OgloszenieService ogloszenieService;


    @RequestMapping("posty")
    @ResponseStatus(HttpStatus.OK)
    public List<Ogloszenie> getOgloszenia(
            @RequestParam(name="kategoria", required = false) String nazwaKategorii,
            @RequestParam(name="uzytkownik", required = false) String nazwaUzytkownika
    ){

        if(nazwaKategorii==null && nazwaUzytkownika==null){
            return ogloszenieService.getOgloszenia();
        }
        if(nazwaKategorii!=null && nazwaUzytkownika==null){
            long id = (new KategoriaService()).getIdKategoriiByNazwa(nazwaKategorii);
            return ogloszenieService.getOgloszeniaByKategoria(id);
        }
        if(nazwaKategorii==null && nazwaUzytkownika!=null){
            long id = (new UzytkownikService()).getIdUzytkownikaByNazwa(nazwaUzytkownika);
            return ogloszenieService.getOgloszeniaByUzytkownik(id);
        }
        return null;
    }
}
