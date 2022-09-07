package com.Tablica.ogloszenie;

import com.Tablica.kategoria.KategoriaRepository;
import com.Tablica.uzytkownik.UzytkownikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service
public class OgloszenieService {

    @Autowired
    OgloszenieRepository ogloszenieRepository;

    @Autowired
    KategoriaRepository kategoriaRepository;

    @Autowired
    UzytkownikRepository uzytkownikRepository;



    public List<Ogloszenie> getOgloszeniaByKategoria(String nazwa){
        return ogloszenieRepository.findAllByKategoria(kategoriaRepository.findFirstByNazwa(nazwa));
    }

    public List<Ogloszenie> getOgloszeniaByAutor(String nazwa){
        return ogloszenieRepository.findAllByAutor(uzytkownikRepository.findFirstByNazwa(nazwa));
    }

    /*
    public List<Ogloszenie> getOgloszenia(){
        return ogloszenieRepository.findAll();
    }
    public List<Ogloszenie> getOgloszeniaByUzytkownik(Uzytkownik autor){
        return ogloszenieRepository.findAllByAutor(autor);
    }*/

    public Ogloszenie createPost(String autor, String kategoria, String tytul, String tekst){
        Ogloszenie post = new Ogloszenie(
                uzytkownikRepository.findFirstByNazwa(autor),
                kategoriaRepository.findFirstByNazwa(kategoria),
                0,  //ocena
                tytul,
                tekst,
                new Date(new java.util.Date().getTime()),
                new ArrayList<>()
                );

        try{
            ogloszenieRepository.save(post);
            return post;
        }catch (Exception e){}

        return null;
    }

}
