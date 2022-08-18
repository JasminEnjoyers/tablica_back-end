package com.Tablica.zgloszenia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZgloszeniaRepository extends JpaRepository<Zgloszenia,Long> {

}
