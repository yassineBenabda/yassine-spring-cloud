package com.yassine.game.restControllers;

import com.yassine.game.service.GameService;
import com.yassine.game.dto.APIResponseDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/games")
@AllArgsConstructor
public class GameController {

    private GameService gamesService;

    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getGameById(@PathVariable("id") Long id )
    {
        return new ResponseEntity<APIResponseDto>(
                gamesService.getGameById(id), HttpStatus.OK);
    }
}