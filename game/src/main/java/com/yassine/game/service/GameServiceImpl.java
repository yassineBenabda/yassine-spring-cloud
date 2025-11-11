package com.yassine.game.service;

import com.yassine.game.dto.GameDto;
import com.yassine.game.dto.GenreDto;
import com.yassine.game.entities.Game;
import com.yassine.game.repos.GameRepository;
import com.yassine.game.dto.APIResponseDto;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class GameServiceImpl implements GameService {

    private GameRepository gameRepository;

    //  private WebClient webClient;

    private APIClient apiClient;

    @Override
    public APIResponseDto getGameById(Long id) {
        String dname;
        Game game = gameRepository.findById(id).get();

        /*DepartmentDto departmentDto = webClient.get()
                .uri("http://localhost:8080/api/departments/" +
                        teacher.getDepCode())
                .retrieve()
                .bodyToMono(DepartmentDto.class)
                .block();*/

        GenreDto genreDto = apiClient.getGenByCode(game.getGenCode());
        if (genreDto == null)
            dname = "Undefined";
        else
            dname = genreDto.getGenName();

        GameDto gameDto = new GameDto(
                game.getId(),
                game.getGameName(),
                game.getGenCode(),
                dname

        );

        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setGameDto(gameDto);
        apiResponseDto.setGenreDto(genreDto);

        return apiResponseDto;

    }
}