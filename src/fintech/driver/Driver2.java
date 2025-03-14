package fintech.driver;

import fintech.model.DigitalWallet;

public class Driver2 {
    public static void main(String[] args) {
        DigitalWallet wallet = new DigitalWallet();
        
        // Simulasi input
        wallet.createAccount("Wiro Sableng", "wirsab");
        wallet.createAccount("Jaka Sembung", "jaksem");

        // Menampilkan akun yang dicari sebelum menampilkan semua akun
        // wallet.findAccount("Milkyman"); // Tidak ada output
        wallet.findAccount("JAKSEM");   // Menampilkan akun "jaksem"

        // Menampilkan semua akun setelah pencarian
        wallet.displayAccounts();
    }
}
