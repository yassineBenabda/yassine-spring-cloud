package com.yassine.game.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class APIResponseDto {
    private GameDto gameDto;
    private GenreDto genreDto;
}