package com.xue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xue.bean.RoncooUser;
import com.xue.dao.RoncooUserMapper;

@RestController
@RequestMapping("/api")
public class ApiController {

	@Autowired
	private RoncooUserMapper roncooUserMappper;

	@RequestMapping(value = "/select", method = RequestMethod.GET)
	public RoncooUser get(@RequestParam(defaultValue = "1") Integer id) {
		return roncooUserMappper.selectByPrimaryKey(id);
	}
}