package com.Tablica.obserwowanyPost;

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
public interface ObserwowanyPostRepository extends JpaRepository<ObserwowanyPost,Long> {
    List<ObserwowanyPost> findAllByOgloszenie(Ogloszenie ogloszenie);

    List<ObserwowanyPost> findAllByUzytkownik(Uzytkownik uzytkownik);

    List<ObserwowanyPost> findAllByUzytkownikAndOgloszenie(Uzytkownik uzytkownik, Ogloszenie ogloszenie);

    Integer deleteAllByIdIn(Set<Long> ids);

    @Modifying
    @Query("delete from ObserwowanyPost where ogloszenie.id = ?1")
    void deleteByOgloszenieId(Long ogloszenieId);
}
