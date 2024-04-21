public class Main {
    public static void main(String[] args) {
        String login = "";
        String password = "sjdfbksjdbv";
        String confirmPassword = "sjdfbksjdbv";
        boolean success = VerificationUser.validate(login, password, confirmPassword);
        if (success) {
            System.out.println("Пользователь подтвержден!");
        } else {
            System.out.println("Пользователь не подтвержден!");
        }

    }
}