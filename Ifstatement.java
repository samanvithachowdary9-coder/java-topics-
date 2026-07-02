import java.util.Scanner;
public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctEmail = "user@example.com";
        String correctPassword = "secure123";
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        if (email.equals(correctEmail) && password.equals(correctPassword)) {
            System.out.println("Login successful! Welcome.");
        } else if (!email.equals(correctEmail)) {
            System.out.println("Invalid email. Please try again.");
        } else if (!password.equals(correctPassword)) {
            System.out.println("Incorrect password. Please try again.");
        } else {
            System.out.println("Login failed. Unknown error.");
        }

        scanner.close();
    }
}
