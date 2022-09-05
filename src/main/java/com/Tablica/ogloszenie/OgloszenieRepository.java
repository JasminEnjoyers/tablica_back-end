package com.Tablica.ogloszenie;

import com.Tablica.kategoria.Kategoria;
import com.Tablica.uzytkownik.Uzytkownik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface OgloszenieRepository extends JpaRepository<Ogloszenie,Long> {
    List<Ogloszenie> findAll();

    List<Ogloszenie> findAllByKategoria(Kategoria kategoria);

    List<Ogloszenie> findAllByAutor(Uzytkownik autor);

    Ogloszenie findFirstById(long id);

    @Modifying
    @Query("delete from Ogloszenie where id = ?1")
    void deleteByOgloszenieId(Long ogloszenieId);
}
