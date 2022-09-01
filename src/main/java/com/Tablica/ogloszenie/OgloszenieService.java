package com.Tablica.ogloszenie;

import com.Tablica.kategoria.KategoriaRepository;
import com.Tablica.uzytkownik.Uzytkownik;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OgloszenieService {

    @Autowired
    OgloszenieRepository ogloszenieRepository;

    @Autowired
    KategoriaRepository kategoriaRepository;

    public List<Ogloszenie> getOgloszenia(){
        return ogloszenieRepository.findAll();
    }

    public List<Ogloszenie> getOgloszeniaByKategoria(String nazwa){
        return ogloszenieRepository.findAllByKategoria(kategoriaRepository.findFirstByNazwa(nazwa));
    }

    public List<Ogloszenie> getOgloszeniaByUzytkownik(Uzytkownik autor){
        return ogloszenieRepository.findAllByAutor(autor);
    }

}
