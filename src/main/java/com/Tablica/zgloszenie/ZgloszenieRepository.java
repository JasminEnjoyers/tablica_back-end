package com.Tablica.zgloszenie;

import com.Tablica.obserwowanyPost.ObserwowanyPost;
import com.Tablica.ogloszenie.Ogloszenie;
import com.Tablica.uzytkownik.Uzytkownik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Repository
@Transactional
public interface ZgloszenieRepository extends JpaRepository<Zgloszenie,Long> {

    List<Zgloszenie> findAllByOgloszenie(Ogloszenie ogloszenie);

    List<Zgloszenie> findAllByUzytkownikAndOgloszenie(Uzytkownik uzytkownik, Ogloszenie ogloszenie);

    @Modifying
    @Query("delete from Zgloszenie where ogloszenie.id = ?1")
    void deleteByOgloszenieId(Long ogloszenieId);
}
