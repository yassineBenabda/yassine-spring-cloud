package com.yassine.game.service;

import com.yassine.game.dto.GenreDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//@FeignClient(url = "http://localhost:8080", value = "DEPARTMENT")
@FeignClient(name = "GENRE")
public interface APIClient {

    @GetMapping("api/genres/{genre-code}")
    GenreDto getGenByCode(@PathVariable("genre-code") String genreCode);
}