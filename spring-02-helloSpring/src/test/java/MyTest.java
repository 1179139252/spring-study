import com.hai.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {

        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Hello hel = (Hello) classPathXmlApplicationContext.getBean("hel");

        String str = hel.getStr();
        System.out.println(str);




    }


}
