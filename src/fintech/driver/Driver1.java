package fintech.driver;
import fintech.model.DigitalWallet;
import java.util.Scanner;

/**
 * @author NIM Nama
 * @author NIM Nama
 */
public class Driver1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DigitalWallet wallet = new DigitalWallet();

        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.equals("---")) {
                break;
            }

            String[] parts = input.split("#");
            if (parts.length == 3 && parts[0].equals("create-account")) {
                String owner = parts[1];
                String accountName = parts[2];
                wallet.createAccount(owner, accountName);
            }
        }

        // Menampilkan semua akun setelah input selesai
        wallet.displayAccounts();
        scanner.close();
    }
}