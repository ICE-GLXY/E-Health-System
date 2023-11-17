package Main.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//import javax.validation.constraints.NotNull;

@Document(collection = "Administrator")
@Data
@AllArgsConstructor
//@Entity
public class administrator {
//    @NotNull
//    @OneToOne
private ObjectId id;
    private User user;
    @Id
//    @NotNull
    private String administratorID;
//    @NotNull
    private String managedUsers;

    protected administrator(){
    }

    public String getAdministratorID() {
        return administratorID;
    }

    public administrator setAdministratorID(String administratorID) {
        this.administratorID = administratorID;
        return this;
    }

    public String getManagedUsers() {
        return managedUsers;
    }

    public administrator setManagedUsers(String managedUsers) {
        this.administratorID = administratorID;
        this.managedUsers = managedUsers;
        return this;
    }

    public User getUser() {
        return user;
    }

    public administrator setUser(User user) {
        this.user = user;
        return this;
    }

    @Override
    public String toString() {
        return "administrator{" +
                "administratorID='" + administratorID + '\'' +
                ", managedUsers='" + managedUsers + '\'' +
                ", user=" + user +
                '}';
    }

    private administrator(Builder b){
        this.user = b.user;
        this.administratorID = b.administratorID;
        this.managedUsers = b.managedUsers;
    }

    public static class Builder{
        private User user;
        private String administratorID;
        private String managedUsers;

        public Builder user(User user) {
            this.user = user;
            return this;
        }
        public Builder administratorID(String administratorID) {
            this.administratorID = administratorID;
            return this;
        }
        public Builder managedUsers(String managedUsers) {
            this.managedUsers = managedUsers;
            return this;
        }

        public Builder copy(administrator e){
            this.user = e.user;
            this.administratorID = e.administratorID;
            this.managedUsers = e.managedUsers;
            return this;
        }

        public administrator build(){
            return new administrator(this);
        }
    }
}

