package com.Tablica.grupa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrupaRepository extends JpaRepository<Grupa,Long> {
    Grupa findAllById(Long id);

    Grupa findFirstById(Long id);
    Grupa findFirstByNazwa(String nazwa);
}
