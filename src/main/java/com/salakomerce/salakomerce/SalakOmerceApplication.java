package com.salakomerce.salakomerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.ArrayList;
import java.util.List;

@EnableJpaRepositories("com.salakomerce.salakomerce.back.model")
@SpringBootApplication

public class SalakOmerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SalakOmerceApplication.class, args);
        List<String> noms = new ArrayList<>();
        noms.add("salakdji Mostefa");
        noms.add("salakdji Khier");


        System.out.println("noms = " + noms);
    }
}
