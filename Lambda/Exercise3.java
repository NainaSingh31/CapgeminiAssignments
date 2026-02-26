package Lambda;

//Lambda for username & password authentication

public class Exercise3 {
    public static void main(String[] args) {

        String correctUsername = "admin";
        String correctPassword = "1234";

        Authenticate auth = (username, password) ->
                username.equals(correctUsername) &&
                        password.equals(correctPassword);

        System.out.println(auth.isValid("admin", "1234"));
        System.out.println(auth.isValid("user", "1111"));
    }
}