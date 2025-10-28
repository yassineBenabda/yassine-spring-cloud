package com.yassine.genre.service;

import com.yassine.genre.dto.GenreDto;

public interface GenreService {
    GenreDto getGenreByCode(String code);
}