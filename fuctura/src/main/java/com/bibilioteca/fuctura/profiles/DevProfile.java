package com.bibilioteca.fuctura.profiles;

import com.bibilioteca.fuctura.services.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevProfile {

    @Autowired
    private DBService dbService;

    @Bean //serve para retornar um objeto que desve
    //ser gerenciado  no container spring e é usada dentro de uma classe
    //anotada @Configuration
    public void instanciaDB() {
        this.dbService.instanciaDB();
    }


}
