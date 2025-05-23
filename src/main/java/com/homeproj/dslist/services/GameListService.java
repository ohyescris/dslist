package com.homeproj.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.homeproj.dslist.dto.GameListDTO;
import com.homeproj.dslist.entities.GameList;
import com.homeproj.dslist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		List<GameListDTO> dtoList = result.stream().map(x -> new GameListDTO(x)).toList();
		
		return dtoList;
	}
}
