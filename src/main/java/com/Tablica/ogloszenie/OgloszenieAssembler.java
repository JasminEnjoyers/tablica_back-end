package com.Tablica.ogloszenie;

import com.Tablica.obserwowanyPost.ObserwowanyPost;
import com.Tablica.obserwowanyPost.ObserwowanyPostRepository;
import com.Tablica.uzytkownik.Uzytkownik;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OgloszenieAssembler {

    @Autowired
    ObserwowanyPostRepository obserwowanyPostRepository;

    private boolean isObserved(Ogloszenie post, Uzytkownik user){
        if((user != null)
                && !(obserwowanyPostRepository.findAllByUzytkownikAndOgloszenie(user,post)).isEmpty()){
            return true;
        }
        return false;
    }

    public OgloszenieDto toOgloszenieDto(Ogloszenie post, Uzytkownik user){
        OgloszenieDto dto = new OgloszenieDto(
                post.getId(),
                post.getTytul(),
                post.getTekst(),
                post.getAutor().getNazwa(),
                post.getData().toString(),
                post.getOcena(),
                post.getKategoria().getNazwa(),
                isObserved(post, user)
        );
        return dto;
    }
}
