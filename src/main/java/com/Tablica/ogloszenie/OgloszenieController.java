package com.Tablica.ogloszenie;

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


    @GetMapping("posty")
    @ResponseStatus(HttpStatus.OK)
    public List<Ogloszenie> getOgloszenia(
            @RequestParam(name="kategoria", required = false) String idKategorii,
            @RequestParam(name="uzytkownik", required = false) String idUzytkownika
    ){
        if(idKategorii==null && idUzytkownika==null){
            return ogloszenieService.getOgloszenia();
        }
        if(idKategorii!=null && idUzytkownika==null){
            return ogloszenieService.getOgloszeniaByKategoria(parseLong(idKategorii));
        }
        if(idKategorii==null && idUzytkownika!=null){
            return ogloszenieService.getOgloszeniaByUzytkownik(parseLong(idUzytkownika));
        }
        return null;
    }
}
