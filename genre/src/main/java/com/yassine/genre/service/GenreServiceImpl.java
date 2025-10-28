package com.yassine.genre.service;

import com.yassine.genre.dto.GenreDto;
import com.yassine.genre.entities.Genre;
import com.yassine.genre.repos.GenreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class GenreServiceImpl implements GenreService {

    private GenreRepository genreRepository;

    @Override
    public GenreDto getGenreByCode(String code) {
        Genre gen = genreRepository.findByGenCode(code);

        GenreDto genreDto = new GenreDto(
                gen.getId(),
                gen.getGenName(),
                gen.getGenCode()
        );

        return genreDto;
    }
}
