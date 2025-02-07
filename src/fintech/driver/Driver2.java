package fintech.driver;
import java.util.*;
import fintech.model.*;

/**
 * @author 12S23008 Ranty Insen Pakpahan
 * @author 12S23048 Grace Caldera Situmorang
 */
public class Driver2 {

    public static void main(String[] _args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Account> accounts = new HashMap<>();
        List<Transaction> transactions = new ArrayList<>();

        
        String command = scanner.nextLine().trim();
        String owner = scanner.nextLine().trim();
        String accountName = scanner.nextLine().trim();

        
        Account account = new Account(owner, accountName);
        accounts.put(accountName, account);

        
        command = scanner.nextLine().trim();
        String transAccountName = scanner.nextLine().trim();
        double amount = Double.parseDouble(scanner.nextLine().trim());
        String postedAt = scanner.nextLine().trim();
        String note = scanner.nextLine().trim();

       
        account.balance += amount;

       
        Transaction transaction = new Transaction(transAccountName, amount, postedAt, note, account.balance);
        transactions.add(transaction);

        
        System.out.println(account);
        System.out.println(transaction);

        scanner.close();

    }

    }

