package com.Tablica.obserwowanePost;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObserwowanePostRepository extends JpaRepository<ObserwowanePost,Long> {

}
