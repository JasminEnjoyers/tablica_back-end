package com.Tablica.ogloszenie;

import com.Tablica.uzytkownik.UzytkownikRepository;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;



@CrossOrigin(allowCredentials = "true", origins = "/**")
@RestController
public class OgloszenieController {
    private Gson gson = new GsonBuilder().create();

    @Autowired
    OgloszenieService ogloszenieService;

    @Autowired
    OgloszenieRepository ogloszenieRepository;

    @Autowired
    OgloszenieAssembler ogloszenieAssembler;

    @Autowired
    UzytkownikRepository uzytkownikRepository;


    @GetMapping("/posty/kategoria")
    @ResponseStatus(HttpStatus.OK)
    public String getOgloszeniaByKategoria(
            @RequestParam(name = "kategoria", required = false) String nazwaKategorii
    ){
        List<Ogloszenie> ogloszenia;
        if (nazwaKategorii == null) {
            ogloszenia = ogloszenieRepository.findAll();
        } else {
            ogloszenia = ogloszenieService.getOgloszeniaByKategoria(nazwaKategorii);
        }
        List<OgloszenieDto> dto = new ArrayList<>();
        ogloszenia.forEach(ogloszenie -> dto.add(ogloszenieAssembler.toOgloszenieDto(ogloszenie)));
        return gson.toJson(dto);
    }

    @GetMapping("/posty/autor")
    @ResponseStatus(HttpStatus.OK)
    public String getOgloszeniaByAutor(
            @RequestParam(name = "autor") String nazwaAutora
    ){
        List<Ogloszenie> ogloszenia;
        if (nazwaAutora == null) {
            return null;
        } else {
            ogloszenia = ogloszenieService.getOgloszeniaByAutor(nazwaAutora);
        }
        List<OgloszenieDto> dto = new ArrayList<>();
        ogloszenia.forEach(ogloszenie -> dto.add(ogloszenieAssembler.toOgloszenieDto(ogloszenie)));
        return gson.toJson(dto);
    }

    @PostMapping("/posty/nowy/{autor}/{kategoria}/{tytul}/{tekst}")
    @ResponseStatus(HttpStatus.OK)
    public String registerUser(
            @PathVariable(name = "autor") String autor,
            @PathVariable(name = "kategoria") String kategoria,
            @PathVariable(name = "tytul") String tytul,
            @PathVariable(name = "tekst") String tekst
    ){
        Ogloszenie post = ogloszenieService.createPost(autor, kategoria, tytul, tekst);

        return gson.toJson(ogloszenieAssembler.toOgloszenieDto(post));
    }

}
