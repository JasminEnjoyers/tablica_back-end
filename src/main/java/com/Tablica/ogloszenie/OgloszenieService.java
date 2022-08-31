package com.Tablica.ogloszenie;

import com.Tablica.kategoria.Kategoria;
import com.Tablica.uzytkownik.Uzytkownik;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OgloszenieService {

    @Autowired
    OgloszenieRepository ogloszenieRepository;

    public List<Ogloszenie> getOgloszenia(){
        return ogloszenieRepository.findAll();
    }

    public List<Ogloszenie> getOgloszeniaByKategoria(Kategoria kategoria){
        return ogloszenieRepository.findAllByKategoria(kategoria);
    }

    public List<Ogloszenie> getOgloszeniaByUzytkownik(Uzytkownik autor){
        return ogloszenieRepository.findAllByAutor(autor);
    }

}
