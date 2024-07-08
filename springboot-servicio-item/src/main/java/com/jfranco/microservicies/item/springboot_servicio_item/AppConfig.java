package com.jfranco.microservicies.item.springboot_servicio_item;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    @Bean("clienteRest")
    public RestTemplate registrarTemplate(){
        return new RestTemplate();
    }
    
}
