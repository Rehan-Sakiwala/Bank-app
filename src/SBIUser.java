import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterface{
    private String name,accountNumber;
    private double balance;
    private String password;
    private static double roi;

    public SBIUser(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        this.roi=6.5;
        this.accountNumber= String.valueOf(UUID.randomUUID());
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
        SBIUser.roi = roi;
    }

    @Override
    public double checkBalance() {
        return this.balance;
    }

    @Override
    public String addMoney(double amount) {
        balance=balance+amount;
        return "Your current balance : "+balance;
    }

    @Override
    public String withdrawMoney(double amount, String enterPassword) {
        if(Objects.equals(enterPassword,password)){
            if(amount>balance)
                return "Insufficient money";
            else{
                balance-=amount;
                return "Your current balance : "+balance;
            }
        }
        else{
            return "Wrong Password";
        }
    }

    @Override
    public double calculateInterest(int years) {
        return (balance+years+roi)/100;
    }
}
