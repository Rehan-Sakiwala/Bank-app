import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
        //Create user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name, Passsword, Balance to create an account : ");
        String name=sc.nextLine();
        String password=sc.nextLine();
        double balance=sc.nextDouble();

        SBIUser user1=new SBIUser(name,balance,password);
        System.out.println(user1.addMoney(10000));

        System.out.println("Enter the amount you want to withdraw : ");
        double money=sc.nextDouble();
        System.out.println("Enter the password : ");
        String enteredPassword=sc.next();
        user1.withdrawMoney(money,enteredPassword);

        System.out.println(user1.calculateInterest(3));


    }
}