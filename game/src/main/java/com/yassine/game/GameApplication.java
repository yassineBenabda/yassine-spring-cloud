package com.yassine.game;

import com.yassine.game.entities.Game;
import com.yassine.game.repos.GameRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@EnableFeignClients
@SpringBootApplication
public class GameApplication {

    public static void main(String[] args) {
        SpringApplication.run(GameApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(GameRepository gameRepository) {
        return args -> {
            gameRepository.save(Game.builder()
                    .gameName("Tekken 7")
                    .genCode("AT")
                    .build());

        };
    }

    @Bean
    public WebClient webClient(){
        return WebClient.builder().build();
    }

}
