package com.yassine.game.service;

import com.yassine.game.dto.APIResponseDto;

public interface GameService {
    APIResponseDto getGameById(Long id);
}
