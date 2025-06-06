package eu.gaiax.difs.aas.config;

import org.keycloak.adapters.KeycloakConfigResolver;
import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KeycloakConfig {

    @Bean
    public KeycloakConfigResolver keycloakConfigResolver() {
        return new SsiKeycloakConfigResolver();
        //return new KeycloakSpringBootConfigResolver();
    }
        
}