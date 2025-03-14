


package fintech.model;

import java.util.ArrayList;
import java.util.List;

public class DigitalWallet {
    private List<Account> accounts;

    public DigitalWallet() {
        accounts = new ArrayList<>(); // Menggunakan ArrayList untuk efisiensi akses
    }

    public void createAccount(String owner, String accountName) {
        Account newAccount = new Account(owner, accountName);
        accounts.add(newAccount); // Menambahkan akun secara urut
    }

    public void displayAccounts() {
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    public void findAccount(String searchKey) {
        for (Account account : accounts) {
            if (account.getAccountName().equalsIgnoreCase(searchKey)) {
                System.out.println(account); // Menampilkan akun yang ditemukan
            }
        }
    }
}
