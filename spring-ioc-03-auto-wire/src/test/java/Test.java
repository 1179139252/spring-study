import com.hai.pojo.Dog;
import com.hai.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.lang.Nullable;

public class Test {
    @org.junit.Test

    public void show(){

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Person person = context.getBean("person", Person.class);

        Dog dog = person.getDog();
        dog.shout();




    }

}
