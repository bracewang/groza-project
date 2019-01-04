import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.wana.user.LoginFacade;

/**
 * Created by Administrator on 2019/1/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-modules.xml")
public class LoginFacadeTest {

	@Autowired
	private LoginFacade loginFacade;

	@Test
	public void login(){
		String userName = "admin";
		String password = "admin";
		loginFacade.login(userName, password);
	}
}
