package com.Tablica.ogloszenie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OgloszenieRepository extends JpaRepository<Ogloszenie,Long> {
    List<Ogloszenie> findAll();

    List<Ogloszenie> findAllByIdKategorii(long id);

    List<Ogloszenie> findAllByIdAutora(long id);
}
