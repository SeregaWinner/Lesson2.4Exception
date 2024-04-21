import Exceptions.WrongLoginException;
import Exceptions.WrongPasswordException;

public class VerificationUser {
    private static final Checker CHECKER = new RegexpChecker();

    public static boolean validate(String login, String password, String confirmPassword) {
        try {
            CHECKER.check(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.printf("%s: %s%n", e.getClass(), e.getMessage());
            return false;
        }
        return true;

    }
}
