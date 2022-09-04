package com.Tablica.obserwowanyPost;

import com.Tablica.ogloszenie.Ogloszenie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface ObserwowanyPostRepository extends JpaRepository<ObserwowanyPost,Long> {
    List<ObserwowanyPost> findAllByOgloszenie(Ogloszenie ogloszenie);

    @Modifying
    @Query("delete from ObserwowanyPost where ogloszenie.id = ?1")
    void deleteByOgloszenieId(Long ogloszenieId);
}
