import com.hai.dao.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {

        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");


        User hah = (User) classPathXmlApplicationContext.getBean("hah");

        String name = hah.getName();
        System.out.println(name);




    }

}
