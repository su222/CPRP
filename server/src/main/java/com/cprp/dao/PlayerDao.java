package com.cprp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cprp.domain.ChampionType;
import com.cprp.domain.Player;

public interface PlayerDao extends JpaRepository<Player, Long> {

	public Player findByUserId(String userId);
	
	@Query("Select p from Player p INNER JOIN p.champion c WHERE c.championType = ?1 AND c.level < 20")
	public Player findPlayerWithChampion(ChampionType type);
	

	public Player findByUserIdAndPassword(String userId, String password);
}
