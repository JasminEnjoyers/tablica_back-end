package com.Tablica.ogloszenie;

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

    public List<Ogloszenie> getOgloszeniaByKategoria(long id_kategorii){
        return ogloszenieRepository.findAllByIdKategorii(id_kategorii);
    }

    public List<Ogloszenie> getOgloszeniaByUzytkownik(long id_autora){
        return ogloszenieRepository.findAllByIdAutora(id_autora);
    }

}
