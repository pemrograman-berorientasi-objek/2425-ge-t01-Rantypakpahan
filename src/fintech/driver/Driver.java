package fintech.driver;

import fintech.model.DigitalWallet;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        DigitalWallet wallet = new DigitalWallet();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (input.equals("---")) break;

            String[] parts = input.split("#");
            String command = parts[0];

            switch (command) {
                case "create-account":
                    if (parts.length == 3) {
                        wallet.createAccount(parts[1], parts[2]);
                    }
                    break;

                case "find-account":
                    if (parts.length == 2) {
                        wallet.findAccount(parts[1]);
                    }
                    break;

                case "create-transaction":
                    if (parts.length >= 4) {
                        String accountName = parts[1];
                        double amount = Double.parseDouble(parts[2]);
                        String postedAt = parts[3];
                        String note = (parts.length == 5) ? parts[4] : "";
                        wallet.createTransaction(parts[1], parts[2], parts[3], parts[4], parts[5]);
                    }
                    break;
            }
        }
        scanner.close();
        wallet.displayAccounts();
    }
}
