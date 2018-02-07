package com.xue;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xue.bean.RoncooUser;
import com.xue.dao.RoncooUserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot10ApplicationTests {

	@Autowired
	private RoncooUserMapper mapper;

	@Test
	public void insert() {
		RoncooUser roncooUser = new RoncooUser();
		roncooUser.setName("测试");
		roncooUser.setCreateTime(new Date());
		int result = mapper.insert(roncooUser);
		System.out.println(result);
	}

}
