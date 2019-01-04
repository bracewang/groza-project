package org.wana.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wana.user.mapper.UserMapper;
import org.wana.user.model.UserExample;

/**
 * Created by Administrator on 2019/1/4.
 */
@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

	public int countAllUser(){
		UserExample userExample = new UserExample();
		return userMapper.countByExample(userExample);
	}
}
