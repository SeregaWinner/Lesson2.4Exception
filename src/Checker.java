import Exceptions.WrongLoginException;
import Exceptions.WrongPasswordException;

public interface Checker {
    void check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException;

    default void throwException(boolean login, String message) throws WrongLoginException, WrongPasswordException {
        if (login) {
            throw new WrongLoginException(message);
        } else {
            throw new WrongPasswordException(message);
        }
    }

}
