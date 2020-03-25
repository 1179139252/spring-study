import com.hai.dao.MysqlImpl;
import com.hai.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void show(){

        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");

        UserServiceImpl userimpl = (UserServiceImpl) classPathXmlApplicationContext.getBean("userimpl");

        userimpl.getUser();


    }


}
