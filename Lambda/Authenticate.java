package Lambda;

@FunctionalInterface
public interface Authenticate {
    boolean isValid(String username, String password);
}