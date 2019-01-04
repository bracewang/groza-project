import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.wana.user.UserService;

/**
 * Created by Administrator on 2019/1/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-modules.xml")
public class UserServiceTest {

	@Autowired
	private UserService userService;

	@Test
	public void countALlUser(){
		int count = userService.countAllUser();
		System.out.println(count);
	}
}
