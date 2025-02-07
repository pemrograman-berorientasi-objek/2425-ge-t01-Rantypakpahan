package fintech.model;

/*
 * @author 12S23008 Ranty Insen Pakpahan
 * @author 12S23048 Grace Caldera Situmorang
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
        return accountName + "|" + owner + "|" + 0.0;
    }
}
