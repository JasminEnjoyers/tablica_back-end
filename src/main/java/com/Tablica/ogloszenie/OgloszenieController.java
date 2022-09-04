package com.Tablica.ogloszenie;

import com.Tablica.kategoria.Kategoria;
import com.Tablica.kategoria.KategoriaDto;
import com.Tablica.obserwowanyPost.ObserwowanyPost;
import com.Tablica.obserwowanyPost.ObserwowanyPostRepository;
import com.Tablica.uzytkownik.UzytkownikRepository;

import com.Tablica.zgloszenie.Zgloszenie;
import com.Tablica.zgloszenie.ZgloszenieRepository;
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

    @Autowired
    ObserwowanyPostRepository obserwowanyPostRepository;

    @Autowired
    ZgloszenieRepository zgloszenieRepository;


    @GetMapping("/api/posty/posty")
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

    @DeleteMapping("/post/delete")
    @ResponseStatus(HttpStatus.OK)
    public void deleteZgloszenie(
            @RequestParam Long ogloszenieId
    ){
        Ogloszenie ogloszenie = ogloszenieRepository.findById(ogloszenieId).orElse(null);
        if(ogloszenie != null){
            obserwowanyPostRepository.deleteByOgloszenieId(ogloszenieId);

            zgloszenieRepository.deleteByOgloszenieId(ogloszenieId);

            ogloszenieRepository.deleteByOgloszenieId(ogloszenieId);
        }
    }

}
