package com.cprp;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cprp.dao.ChampionDao;
import com.cprp.dao.PlayerDao;
import com.cprp.domain.Champion;
import com.cprp.domain.ChampionType;
import com.cprp.domain.Player;

@Component
public class MockDataService {

	@Autowired
	private PlayerDao playerDao;
	
	@Autowired
	private ChampionDao championDao;
	
	@Transactional
	public void createTestData() {
		
		Player player = new Player();
		player.setPassword("1111");
		player.setUserId("test");
		
		Champion champion = new Champion();
		champion.setBaseDexterity(10);
		champion.setBaseEndurance(10);
		champion.setBaseStrength(15);
		champion.setChampionType(ChampionType.Leesin);
		champion.setLevel(1);
		
		champion.setPlayer(player);
		player.addChampion(champion);
		
		playerDao.save(player);
		championDao.save(champion);
	}
}
