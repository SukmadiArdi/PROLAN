package Latihan2Modul;

import java.util.Scanner;

// Custom exception untuk email tidak valid
class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

public class EmailValidation {
    // Method untuk validasi email
    public static void validateEmail(String email) throws InvalidEmailException {
        if (!email.endsWith("@webmail.umm.ac.id")) {
            throw new InvalidEmailException("Alamat email harus diakhiri dengan '@webmail.umm.ac.id'.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValidEmail = false;

        while (!isValidEmail) {
            System.out.print("Masukkan alamat email Anda (harus diakhiri dengan '@webmail.umm.ac.id'): ");
            String email = scanner.nextLine().trim();

            try {
                validateEmail(email);
                isValidEmail = true;
                System.out.println("Alamat email Anda adalah: " + email);
            } catch (InvalidEmailException e) {
                System.err.println(e.getMessage());
                System.out.println("Kesalahan validasi email: " + e.getMessage());
                System.out.println("Silakan coba lagi.");
            }
        }


        scanner.close();
    }
}