package com.cprp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cprp.dao.CodeDao;
import com.cprp.domain.code.CodeMaster;

@Service
public class CodeService {
	
	@Autowired
	private CodeDao codeDao;
	
	public List<CodeMaster> searchMasterCode(){
		return codeDao.findAll();
	};
	
	public void saveMasterCode(CodeMaster code) {
		codeDao.save(code);
	}
}
