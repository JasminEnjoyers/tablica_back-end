package com.Tablica.uzytkownik;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UzytkownikRepository extends JpaRepository<Uzytkownik,Long> {
    Uzytkownik findFirstById(Long id);
    Uzytkownik findFirstByNazwa(String nazwa);
    Uzytkownik findFirstByEmail(String email);
    Uzytkownik findFirstByTelefon(String phone);

}
