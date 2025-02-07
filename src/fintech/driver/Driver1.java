package fintech.driver;

import fintech.model.Account;
import fintech.model.Transaction;

import java.util.Scanner;
/**
 * @author 12S23008 Ranty Insen Pakpahan
 * @author 12S23048 Grace Caldera Situmorang
 */
public class Driver1 {

    public static void main(String[] _args) {

        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String owner = scanner.nextLine();

        String accountName = scanner.nextLine();
        
        if (command.equals("create-account")) {
            System.out.println(accountName + "|" + owner + "|" + 0.0 );

        } else {
            System.out.println("Perintah tidak valid");
        }

    }

}
