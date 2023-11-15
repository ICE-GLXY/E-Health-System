package factory;

import domain.User;
import domain.administrator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class administratorFactoryTest {

    User user1 = new User.Builder().username("user1").name("name1").password("password1").cellPhoneNumber("123456789").email("email1@gmail.com").userType("administrator").build();
    User user2 = new User.Builder().username("user2").name("name2").password("password2").cellPhoneNumber("987654321").email("email2@gmail.com").userType("administrator").build();
    ArrayList<domain.administrator> administrator = new ArrayList<>();
    private final administrator administrator1 = administratorFactory.builder(user1, "ID1", "userlist");
    private final administrator administrator2 = administratorFactory.builder(user2, "ID2", "userlist");

    @Test
    void builder() {
        administrator.add(administrator1);
        System.out.println(administrator.get(0));
        administrator.add(administrator2);
        System.out.println(administrator.get(1));
        assertNotNull(administrator);
    }
}