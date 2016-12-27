package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationApplication {

    @Bean
    public TollProcessingTask tollProcessingTask (){
        return new TollProcessingTask();
    }
}
