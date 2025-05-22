package com.devwesley.dslist.repositories;

import com.devwesley.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository <GameList, Long> {

}
