import com.hai.pojo.Studen;
import com.hai.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Studen student = (Studen) context.getBean("student");
        System.out.println(student.toString());

    }


    @Test
    public void show(){

      ApplicationContext context = new ClassPathXmlApplicationContext("user.xml");
        User user = context.getBean("user", User.class);
        User user1 = context.getBean("user", User.class);
        System.out.println(user==user1);

        System.out.println(user.hashCode()+"------------"+user1.hashCode());

        System.out.println(user.toString());


    }


}
