package com.Tablica.zgloszenie;

import com.Tablica.ogloszenie.Ogloszenie;
import com.Tablica.ogloszenie.OgloszenieRepository;
import com.Tablica.uzytkownik.Uzytkownik;
import com.Tablica.uzytkownik.UzytkownikRepository;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@CrossOrigin(allowCredentials = "true", origins = "/**")
@RestController
public class ZgloszenieController {

    private Gson gson = new GsonBuilder().create();

    @Autowired
    ZgloszenieRepository zgloszenieRepository;

    @Autowired
    ZgloszenieAssembler zgloszenieAssembler;

    @Autowired
    OgloszenieRepository ogloszenieRepository;

    @Autowired
    UzytkownikRepository uzytkownikRepository;

    @GetMapping("/reported/all")
    @ResponseStatus(HttpStatus.OK)
    public String createListOfReportedPosts(){
        List<Zgloszenie> zgloszenia = zgloszenieRepository.findAll();
        Set<Ogloszenie> ogloszenia = new HashSet<Ogloszenie>();

        for (Zgloszenie zgloszenie : zgloszenia) {
            ogloszenia.add(zgloszenie.getOgloszenie());
        }

        List<ZgloszenieDto> result = new ArrayList<ZgloszenieDto>();

        for (Ogloszenie ogloszenie : ogloszenia) {
            result.add(zgloszenieAssembler.ogloszenieToZgloszenieDto(ogloszenie));
        }

        return gson.toJson(result);
    }

    @DeleteMapping("/reported/leave")
    @ResponseStatus(HttpStatus.OK)
    public void deleteZgloszenie(
            @RequestParam Long ogloszenieId
    ){
        Ogloszenie ogloszenie = ogloszenieRepository.findById(ogloszenieId).orElse(null);

        if(ogloszenie != null) {
            List<Zgloszenie> zgloszenia = zgloszenieRepository.findAllByOgloszenie(ogloszenie);

            zgloszenieRepository.deleteAll(zgloszenia);

        }
    }

    @PutMapping("/report/add")
    @ResponseStatus(HttpStatus.OK)
    public void addZgloszenie(
            @RequestParam Long ogloszenieId,
            @RequestParam Long uzytkownikId
    ){
        Uzytkownik uzytkownik = uzytkownikRepository.findById(uzytkownikId).orElse(null);

        Ogloszenie ogloszenie = ogloszenieRepository.findById(ogloszenieId).orElse(null);

        List<Zgloszenie> zgloszone = zgloszenieRepository.findAllByUzytkownikAndOgloszenie(uzytkownik, ogloszenie);

        if(uzytkownik != null && ogloszenie != null && zgloszone.isEmpty()){
            Zgloszenie zgloszenie = new Zgloszenie(uzytkownik,ogloszenie);
            zgloszenieRepository.save(zgloszenie);
        }

    }

}
