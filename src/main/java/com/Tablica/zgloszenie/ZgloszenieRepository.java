package com.Tablica.zgloszenie;

import com.Tablica.ogloszenie.Ogloszenie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface ZgloszenieRepository extends JpaRepository<Zgloszenie,Long> {

    List<Zgloszenie> findAllByOgloszenie(Ogloszenie ogloszenie);

}
