package user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import run.User;
import run.User_use;
import test03.Parking_in;
import test03.Parking_out;

public class user {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
      User user= (User) context.getBean("user_use");
      user.out();
    }
}
