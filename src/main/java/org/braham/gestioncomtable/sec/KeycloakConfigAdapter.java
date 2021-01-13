package org.braham.gestioncomtable.sec;

import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KeycloakConfigAdapter {

    @Bean
    public KeycloakSpringBootConfigResolver keycloakSpringBootConfigResolver (){
        return new KeycloakSpringBootConfigResolver();
    }
}
