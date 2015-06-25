package com.cprp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cprp.domain.code.CodeMaster;
import com.cprp.service.CodeService;

@RestController
@RequestMapping("/admin")
public class CodeController {
	
	@Autowired
	private CodeService codeService;

	@RequestMapping(value = "/searchMasterCode", method = RequestMethod.POST)
	public List<CodeMaster> searchMaster(@Valid final String code) {
		return codeService.searchMasterCode();
	}
}
