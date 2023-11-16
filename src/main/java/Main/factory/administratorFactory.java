package Main.factory;

import Main.domain.User;
import Main.domain.administrator;

public class administratorFactory {
    public static administrator builder(User user, String administratorID, String managedUsers){

        if(administratorID.isEmpty())
            throw new IllegalArgumentException("no administrator ID");
        return new administrator.Builder()
                .user(user)
                .administratorID(administratorID)
                .managedUsers(managedUsers)
                .build();
    }
}
