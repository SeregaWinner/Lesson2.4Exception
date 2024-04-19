import Exceptions.WrongLoginException;
import Exceptions.WrongPasswordException;

import java.util.Objects;

public class Main {

    public static void verificationUser(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        boolean testLogin = login.matches("^[\\w+]+$");
        boolean testPassword = password.matches("^[\\w+]+$");
        if (!testLogin || login.length() >= 20) {
            throw new WrongLoginException("Можно использовать только латинские буквы, цифры и знак подчеркивания," +
                    " Login должен состоять не более чем из 20 символов, слишком длинный");
        }
        if (!testPassword || password.length() >= 20) {
            throw new WrongPasswordException("Можно использовать только латинские буквы, цифры и знак подчеркивания" +
                    " Password должен состоять не более чем из 20 символов, слишком длинный");
        } else if (!Objects.equals(password, confirmPassword)) {
            throw new WrongLoginException("Пароли не совподают");
        } else {
            System.out.println("Пользователь подтвержден!");
        }
    }

    public static void main(String[] args) {
        try {
            verificationUser("Serega_Winner92", "sjdfbksjdbv", "sjdfbksjdbv");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }

    }
}