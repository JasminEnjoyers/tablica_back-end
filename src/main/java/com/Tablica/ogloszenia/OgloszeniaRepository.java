package com.Tablica.ogloszenia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OgloszeniaRepository extends JpaRepository<Ogloszenia,Long> {

}
