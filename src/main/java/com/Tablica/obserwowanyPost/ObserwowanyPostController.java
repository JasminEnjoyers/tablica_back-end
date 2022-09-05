package com.Tablica.obserwowanyPost;

import com.Tablica.ogloszenie.Ogloszenie;
import com.Tablica.ogloszenie.OgloszenieAssembler;
import com.Tablica.ogloszenie.OgloszenieDto;
import com.Tablica.ogloszenie.OgloszenieRepository;
import com.Tablica.uzytkownik.Uzytkownik;
import com.Tablica.uzytkownik.UzytkownikRepository;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@CrossOrigin(allowCredentials = "true", origins = "/**")
@RestController
public class ObserwowanyPostController {

    private Gson gson = new GsonBuilder().create();

    @Autowired
    ObserwowanyPostRepository obserwowanyPostRepository;

    @Autowired
    UzytkownikRepository uzytkownikRepository;

    @Autowired
    OgloszenieAssembler ogloszenieAssembler;

    @Autowired
    OgloszenieRepository ogloszenieRepository;

    @GetMapping("/followed/all")
    @ResponseStatus(HttpStatus.OK)
    public String createListOfFollowedPosts(
            @RequestParam Long userId
    ){
        Uzytkownik uzytkownik = uzytkownikRepository.findById(userId).orElse(null);

        if(uzytkownik != null) {
            List<ObserwowanyPost> obserwowane = obserwowanyPostRepository.findAllByUzytkownik(uzytkownik);
            Set<OgloszenieDto> ogloszenia = new HashSet<OgloszenieDto>();

            for (ObserwowanyPost obserwowany: obserwowane) {
                ogloszenia.add(ogloszenieAssembler.toOgloszenieDto(obserwowany.getOgloszenie()));
            }

            return gson.toJson(ogloszenia);
        }
        else{
            return gson.toJson(null);
        }
    }

    @PutMapping("/followed/add")
    @ResponseStatus(HttpStatus.OK)
    public void addObserwowane(
            @RequestParam Long userId,
            @RequestParam Long postId
    ){
        Uzytkownik uzytkownik = uzytkownikRepository.findById(userId).orElse(null);
        Ogloszenie ogloszenie = ogloszenieRepository.findById(postId).orElse(null);

        List<ObserwowanyPost> obserwowane = obserwowanyPostRepository.findAllByUzytkownikAndOgloszenie(uzytkownik,ogloszenie);

        if(uzytkownik != null && ogloszenie != null && obserwowane.isEmpty()){
            ObserwowanyPost obserwowany = new ObserwowanyPost(uzytkownik,ogloszenie);
            obserwowanyPostRepository.save(obserwowany);
        }
    }

    @DeleteMapping("/followed/delete")
    @ResponseStatus(HttpStatus.OK)
    public void deleteObserwowane(
            @RequestParam Long userId,
            @RequestParam Long postId
    ){
        Uzytkownik uzytkownik = uzytkownikRepository.findById(userId).orElse(null);
        Ogloszenie ogloszenie = ogloszenieRepository.findById(postId).orElse(null);

        if(uzytkownik != null && ogloszenie != null){
            List<ObserwowanyPost> obserwowane = obserwowanyPostRepository.findAllByUzytkownikAndOgloszenie(uzytkownik,ogloszenie);
            Set<Long> ids = new HashSet<Long>();

            for (ObserwowanyPost obserwowany: obserwowane) {
                ids.add(obserwowany.getId());
            }

            obserwowanyPostRepository.deleteAllByIdIn(ids);
        }
    }
}
