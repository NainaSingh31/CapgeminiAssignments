package DigitalCom;

public class User implements IValidate {

    private String userid;
    private String password;

    public User() {
    }

    public void addUser(String userid, String password) {
        this.userid = userid;
        this.password = password;
        System.out.println("User Registered Successfully!");
    }

    @Override
    public boolean IsAuthenticated(String userid, String password) {
        return this.userid != null &&
                this.password != null &&
                this.userid.equals(userid) &&
                this.password.equals(password);
    }

    public String getUserid() {
        return userid;
    }

    public String getPassword() {
        return password;
    }
}
