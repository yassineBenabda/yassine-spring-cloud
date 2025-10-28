package com.yassine.genre.repos;

import com.yassine.genre.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre,Long> {
    Genre findByGenCode(String code);
}