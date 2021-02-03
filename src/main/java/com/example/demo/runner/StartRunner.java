package com.example.demo.runner;

import com.example.demo.person.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StartRunner {

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            System.out.println("Test Startup");
        };
    }

}
