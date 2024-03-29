package com.mostain.syed.ahmed.yourthoughts.security;

import com.mostain.syed.ahmed.yourthoughts.exceptions.YourThoughtsException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.Authentication;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.security.*;
import java.security.cert.CertificateException;

public class JwtProvider {

    private KeyStore keyStore;

    @PostConstruct
    public void init(){
        try{
            keyStore = KeyStore.getInstance("JKS");
            InputStream resourceAsStream = getClass().getResourceAsStream("/springblog.jks");
            keyStore.load(resourceAsStream, "secret".toCharArray());
        } catch (KeyStoreException | CertificateException | NoSuchAlgorithmException | IOException e) {
            throw new YourThoughtsException("Exception occurred while loading keystore");
        }
    }

    public String generateToken(Authentication authentication){
        User principle = (User) authentication.getPrincipal();
        return Jwts.builder()
                .setSubject(principle.getUsername())
                .signWith(SignatureAlgorithm.valueOf("SHA256"), getPrivateKey())
                .compact();
    }

    public PrivateKey getPrivateKey() {
        try{
            return (PrivateKey) keyStore.getKey("springblog", "secret".toCharArray());
        } catch(KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException e){
            throw new YourThoughtsException("Exception occured while retrieving public key from keys");
        }
    }

}
