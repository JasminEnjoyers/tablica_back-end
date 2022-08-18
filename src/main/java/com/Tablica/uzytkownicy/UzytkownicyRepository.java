package com.Tablica.uzytkownicy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UzytkownicyRepository extends JpaRepository<Uzytkownicy,Long> {

}
