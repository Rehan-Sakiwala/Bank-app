import java.util.UUID;

public class HDFCUser implements BankInterface{

    private String name,accountNumber;
    private double balance;
    private String password;
    private static double roi;

    public HDFCUser(String name, double balance, String password) {
        this.name = name;
        this.accountNumber = String.valueOf(UUID.randomUUID());
        this.roi=7.2;
        this.balance = balance;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static double getRoi() {
        return roi;
    }

    public static void setRoi(double roi) {
        HDFCUser.roi = roi;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(double amount) {
        balance+=amount;
        return null;
    }

    @Override
    public String withdrawMoney(double amount, String password) {
        return null;
    }

    @Override
    public double calculateInterest(int years) {
        return (balance+roi+years)/100;
    }
}
