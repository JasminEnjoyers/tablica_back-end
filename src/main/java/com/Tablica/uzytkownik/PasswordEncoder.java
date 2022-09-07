package com.Tablica.uzytkownik;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {
    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public Boolean passwordsMatching(String oldPassword,String newPassword){
        return passwordEncoder.matches(oldPassword, newPassword);
    }

    public String encodePassword(String password) {
        return passwordEncoder.encode(password);
    }
}
