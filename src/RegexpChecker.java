import Exceptions.WrongLoginException;
import Exceptions.WrongPasswordException;

public class RegexpChecker implements Checker {
    public void check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        String regexp = "^\\w{1,20}$";
        if (login == null) {
            throwException(true, "Заполните поле!");
        }
        if (password == null || confirmPassword == null) {
            throwException(false, "Заполните поле!");
        }
        if (!login.matches(regexp)) {
            throwException(true, "Можно использовать только латинские буквы, " +
                    "цифры и знак подчеркивания или некорректная длина");
        }
        if (!password.matches(regexp)) {
            throwException(false, "Можно использовать только латинские буквы, " +
                    "цифры и знак подчеркивания или некорректная длина");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }
}