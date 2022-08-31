package com.Tablica.kategoria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KategoriaRepository extends JpaRepository<Kategoria,Long> {
    List<Kategoria> findAll();

    Kategoria findFirstById(Long id);
    Kategoria findFirstByNazwa(String nazwa);
}
