package com.Tablica.ogloszenie;

import com.Tablica.kategoria.Kategoria;
import com.Tablica.uzytkownik.Uzytkownik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OgloszenieRepository extends JpaRepository<Ogloszenie,Long> {
    List<Ogloszenie> findAll();

    List<Ogloszenie> findAllByKategoria(Kategoria kategoria);

    List<Ogloszenie> findAllByAutor(Uzytkownik autor);
}
