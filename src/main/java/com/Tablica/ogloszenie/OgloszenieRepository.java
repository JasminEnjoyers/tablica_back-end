package com.Tablica.ogloszenie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OgloszenieRepository extends JpaRepository<Ogloszenie,Long> {

}
