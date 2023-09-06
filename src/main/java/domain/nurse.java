package domain;

public class nurse extends User{
    private String name;

    protected nurse(){
    }

    private nurse(Builder b){
        this.name = b.name;
    }

    public String getName() {
        return name;
    }

    public nurse setName(String name) {
        this.name = name;
        return this;
    }

    public nurse(String username, String password, String userType, int cellPhoneNumber, String email, String name) {
        super (username, password, userType, cellPhoneNumber, email);
        this.name = name;
    }

    public static class Builder{
        private String name;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder copy(nurse e){
            this.name = e.name;
            return this;
        }

        public nurse build(){
            return new nurse(this);
        }
    }
}
