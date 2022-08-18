package com.Tablica.obserwowanePosty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObserwowanePostyRepository extends JpaRepository<ObserwowanePosty,Long> {

}
