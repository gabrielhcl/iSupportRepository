import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yongyou.iSupport.dao.IsBProjectDao;
import com.yongyou.iSupport.entity.IsBProjectExample;
import com.yongyou.iSupport.entity.IsBProjectExample.Criteria;

@RunWith(SpringJUnit4ClassRunner.class)//表示整合JUnit4进行测试
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})//加载spring配置文件
public class BaseTest {
	
	@Autowired
	private IsBProjectDao isBProjectDao;
	@Test
	public void test_three(){
		  IsBProjectExample isBExample = new IsBProjectExample();
		  Criteria createCriteria = isBExample.createCriteria();
		  createCriteria.andProjectnameEqualTo("项目测试");
		  isBProjectDao.deleteByExample(isBExample);
	}
}
