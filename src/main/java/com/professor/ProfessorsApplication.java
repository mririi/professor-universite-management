package com.professor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.professor.entities.Professor;

@SpringBootApplication
public class ProfessorsApplication implements CommandLineRunner {

    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(ProfessorsApplication.class, args);
    }

    @Override
    public void run(String... args) {
        repositoryRestConfiguration.exposeIdsFor(Professor.class);
    }

}
