import java.util.Scanner;

public class PasswordValidator {

    // Custom Exception
    static class InvalidPasswordException extends Exception {
        public InvalidPasswordException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        try {
            validatePassword(password);
            System.out.println("Password valid.");
        } catch (InvalidPasswordException e) {
            System.out.println("Password tidak valid: " + e.getMessage());
        }
    }

    // Method untuk memvalidasi password
    public static void validatePassword(String password) throws InvalidPasswordException {
        if (password.length() < 8) {
            throw new InvalidPasswordException("Password harus memiliki minimal 8 karakter.");
        }

        if (!password.matches(".*[A-Z].*")) {
            throw new InvalidPasswordException("Password harus mengandung setidaknya satu huruf besar (A-Z).");
        }

        if (!password.matches(".*[a-z].*")) {
            throw new InvalidPasswordException("Password harus mengandung setidaknya satu huruf kecil (a-z).");
        }

        if (!password.matches(".*[0-9].*")) {
            throw new InvalidPasswordException("Password harus mengandung setidaknya satu angka (0-9).");
        }

        if (!password.matches(".*[!@#$%^&*].*")) {
            throw new InvalidPasswordException("Password harus mengandung setidaknya satu karakter khusus ('!', '@', '#', '$', '%', '^', '&', '*').");
        }
    }
}
