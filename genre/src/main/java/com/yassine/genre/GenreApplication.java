package com.yassine.genre;

import com.yassine.genre.entities.Genre;
import com.yassine.genre.repos.GenreRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GenreApplication {

    public static void main(String[] args) {
        SpringApplication.run(GenreApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(GenreRepository genreRepository) {
        return args -> {
            genreRepository.save(Genre.builder()
                    .genName("Action")
                    .genCode("AT")
                    .build());

            genreRepository.save(Genre.builder()
                    .genName("Sport")
                    .genCode("SP")
                    .build());
        };
    }
}
