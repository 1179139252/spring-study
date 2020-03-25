


import com.hai.mapper.UserMapper;
import com.hai.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;


public class Afei {

    public static void main(String[] args) throws IOException {


        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.fxml");

        UserMapper userMapper = context.getBean("UserMapper", UserMapper.class);

        List<User> allUser = userMapper.getAllUser();

        for (User user : allUser) {

            System.out.println(user);

        }




    }


}
