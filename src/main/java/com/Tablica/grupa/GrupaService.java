package com.Tablica.grupa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GrupaService {
    @Autowired
    GrupaRepository grupaRepository;

}
