package bankingproject;

import java.util.Scanner;

public class Account {
    private static String Acc_Number;
    private double Acc_Balance;
    private String Acc_Name;
    private String Acc_Email;
    private static String Acc_PhoneNumber;

    Scanner sc = new Scanner(System.in);

    public Account(String Number, double Balance, String Name, String Email, String PhoneNumber) {
        Account.Acc_Number = Number;
        this.Acc_Balance = Balance;
        this.Acc_Name = Name;
        this.Acc_Email = Email;
        Account.Acc_PhoneNumber = PhoneNumber;
    }

    public void DepositMoney(double DepositedMoney) {
        this.Acc_Balance += DepositedMoney;
        System.out.println("Deposit is Successful, new Balance is " + this.Acc_Balance);
    }

    public void WithDrawMoney(double WithdrawalMoney) {
        if (this.Acc_Balance - WithdrawalMoney < 0) {
            System.out.println("WithDraw Unseccessful only " + this.Acc_Balance + " is left");
        } else {
            this.Acc_Balance -= WithdrawalMoney;
            System.out.println("Withdraw successful, Current Balance is " + this.Acc_Balance);
        }
    }

    public String getNumber() {
        return Acc_Number;
    }

    public void setNumber(String number) {
        Acc_Number = number;
    }

    public double getBalance() {
        return Acc_Balance;
    }

    public void setBalance(double balance) {
        Acc_Balance = balance;
    }

    public String getName() {

        return Acc_Name;
    }

    public void setName(String name) {

        Acc_Name = name;
    }

    public String getEmail() {
        return Acc_Email;
    }

    public void setEmail(String email) {
        Acc_Email = email;
    }

    public String getPhoneNumber() {
        return Acc_PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        Acc_PhoneNumber = phoneNumber;
    }
}