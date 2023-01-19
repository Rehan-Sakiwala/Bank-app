public interface BankInterface {

    double checkBalance();
    String addMoney(double amount);
    String withdrawMoney(double amount, String password);
    double calculateInterest(int years);
}
