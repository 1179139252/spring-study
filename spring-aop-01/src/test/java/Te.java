import com.hai.service.Uservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Te {
    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Uservice userviceImpl = context.getBean("UserviceImpl", Uservice.class);


        userviceImpl.add();


    }

}
