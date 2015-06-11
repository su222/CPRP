package com.cprp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cprp.domain.Champion;

public interface ChampionDao extends JpaRepository<Champion, Integer> {

}
