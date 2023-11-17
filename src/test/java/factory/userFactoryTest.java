package factory;

import Main.factory.userFactory;
import Main.domain.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class userFactoryTest {

    ArrayList<User> user = new ArrayList<>();
    private final User user1 = userFactory.builder("user1", "name1", "password1", "userType1", "123456789", "email1@email.com");
    private final User user2 = userFactory.builder("user2", "name2", "password2", "userType2", "987654321", "email2@email.com");
    @Test
    void builder() {
        user.add(user1);
        System.out.println(user.get(0));
        user.add(user2);
        System.out.println(user.get(1));
        assertNotNull(user);
    }
}