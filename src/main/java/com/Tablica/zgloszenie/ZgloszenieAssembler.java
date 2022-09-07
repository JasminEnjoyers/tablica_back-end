package com.Tablica.zgloszenie;

import com.Tablica.ogloszenie.Ogloszenie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ZgloszenieAssembler {

    @Autowired
    ZgloszenieRepository zgloszenieRepository;

    ZgloszenieDto ogloszenieToZgloszenieDto(Ogloszenie ogloszenie){
        if(ogloszenie != null){

            List<Zgloszenie> zgloszeniaPolaczone = zgloszenieRepository.findAllByOgloszenie(ogloszenie);
            List<String> osobyZglaszajace = new ArrayList<String>();

            for (Zgloszenie element : zgloszeniaPolaczone) {
                osobyZglaszajace.add(element.getUzytkownik().getNazwa());
            }

            ZgloszenieDto dto = new ZgloszenieDto(
                    ogloszenie.getId(),
                    ogloszenie.getTytul(),
                    ogloszenie.getTekst(),
                    ogloszenie.getAutor().getNazwa(),
                    ogloszenie.getData().toString(),
                    ogloszenie.getKategoria().getNazwa(),
                    osobyZglaszajace
            );
            return dto;
        }
        return null;
    }

}
