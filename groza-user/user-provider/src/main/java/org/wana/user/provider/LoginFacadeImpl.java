package org.wana.user.provider;

import org.wana.user.LoginFacade;
import org.wana.user.UserService;

/**
 * Created by Administrator on 2019/1/4.
 */
public class LoginFacadeImpl implements LoginFacade {

	private UserService userService;
	@Override
	public String login(String username, String password) {
		int count = userService.countAllUser();
		if(count > 0){
			return "success";
		}
		return "fail";
	}

}
