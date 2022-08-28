package com.Tablica.kategoria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KategoriaService {
    @Autowired
    KategoriaRepository kategoriaRepository;

    public long getIdKategoriiByNazwa(String nazwa){
        return kategoriaRepository.findFirstByNazwa(nazwa).getId();
    }

    public List<Kategoria> getKategorie(){return kategoriaRepository.findAll();}
}
