package com.yassine.game.service;

import com.yassine.game.dto.GenreDto;
import org.springframework.stereotype.Component;

@Component
public class GenFallBack implements APIClient {

    @Override
    public GenreDto getGenByCode(String genreCode) {
        return null;
    }
}

