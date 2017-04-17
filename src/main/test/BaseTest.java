import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yongyou.iSupport.dao.AreaDao;
import com.yongyou.iSupport.entity.Area;

@RunWith(SpringJUnit4ClassRunner.class)//表示整合JUnit4进行测试
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})//加载spring配置文件
public class BaseTest {
	
	@Autowired
	private AreaDao isb;
	@Test
	public void test_three(){
		 Area key = isb.selectByPrimaryKey(1);
		String address = key.getAreacode();
		System.out.println(address);
	}
}
