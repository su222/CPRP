package com.cprp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cprp.domain.code.CodeMaster;

public interface CodeDao extends JpaRepository<CodeMaster, Integer> {
}
