package com.homeproj.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homeproj.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
