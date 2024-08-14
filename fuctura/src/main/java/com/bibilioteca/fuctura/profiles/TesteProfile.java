package com.bibilioteca.fuctura.profiles;

import com.bibilioteca.fuctura.services.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TesteProfile {

@Autowired
    private DBService dbService;

@Bean
    public void instanciaDB() {
    this.dbService.instanciaDB();
}
}
