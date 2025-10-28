package com.yassine.game.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GameDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String genCode;
    private String GenName;

}