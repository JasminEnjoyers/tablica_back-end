package com.Tablica.kategoria;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Long.parseLong;

@CrossOrigin(allowCredentials = "true", origins = "/**")
@RestController
@RequestMapping("api/kategorie")
public class KategoriaController {
    private Gson gson = new GsonBuilder().create();


    @Autowired
    KategoriaRepository kategoriaRepository;

    @Autowired
    KategoriaService kategoriaService;


    @Autowired
    KategoriaAssembler kategoriaAssembler;


    @GetMapping("kategorie")
    @ResponseStatus(HttpStatus.OK)
    public String getKategorie(){
        List<Kategoria> kategorie = kategoriaRepository.findAll();
        List<KategoriaDto> dto = new ArrayList<>();
        kategorie.forEach(kategoria -> dto.add(kategoriaAssembler.toKategoriaDto(kategoria)));

        return gson.toJson(dto);
    }
    
    /*@GetMapping("kategoria")
    @ResponseStatus(HttpStatus.OK)
    public Kategoria findFirstById(
            @RequestParam String id
    ){
        Kategoria category = kategoriaRepository.findFirstById(parseLong(id));
        if(category != null) {
            return category;
        }
        else return new Kategoria();
    }*/
}
