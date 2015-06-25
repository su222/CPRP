package com.cprp;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cprp.dao.ChampionDao;
import com.cprp.dao.CodeDao;
import com.cprp.domain.code.CodeMaster;

@Component
public class MockDataService {

	@Autowired
	private CodeDao codeDao;
	
	@Autowired
	private ChampionDao championDao;
	
	@Transactional
	public void createTestData() {
		CodeMaster c = new CodeMaster();
		c.setCode("C001");
		c.setName("품종코드");
		c.setDescription("품종코드");
		codeDao.save(c);
		CodeMaster c2 = new CodeMaster();
		c2.setCode("C002");
		c2.setName("브랜드코드");
		c2.setDescription("브랜드코드");
		codeDao.save(c2);
		CodeMaster c3 = new CodeMaster();
		c3.setCode("C003");
		c3.setName("거래처코드");
		c3.setDescription("거래처코드");
		codeDao.save(c3);
	}
	
	private String createCode(int i) {
		if (i > 9) {
			return "A0" + i;
		} else {
			return "A00" + i;
		}
	}
}
