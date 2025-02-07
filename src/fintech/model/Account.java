package fintech.model;

/**
 * @author NIM Nama
 * @author NIM Nama
 */
public class Account {
    String owner;
    String accountName;
    public double balance;

    
    public Account(String owner, String accountName) {
        this.owner = owner;
        this.accountName = accountName;
        this.balance = 0.0;
    }
    
    @Override
    public String toString() {
        return accountName + "|" + owner + "|" + balance;
    }
}
