package com.Tablica.obserwowanyPost;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObserwowanyPostRepository extends JpaRepository<ObserwowanyPost,Long> {

}
