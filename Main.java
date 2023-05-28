package bankingproject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                Account userAccount = new Account(null, 0, null, null, null);

                int i = 0;

                System.out.println("enter your account name:");
                String Name = sc.nextLine();
                userAccount.setName(Name);
                System.out.println("enter your account number:");
                String number = sc.nextLine();
                userAccount.setNumber(number);
                System.out.println("enter your phone number:");
                String phoneNumber = sc.nextLine();
                userAccount.setPhoneNumber(phoneNumber);
                System.out.println("enter your email address");
                String email = sc.nextLine();
                userAccount.setEmail(email);
                System.out.println("enter your account balance");

                boolean wenttocatch;
                Double Balance =  0.0;
                do {
                        try {
                                wenttocatch = false;
                                Balance = sc.nextDouble();
                        } catch (InputMismatchException e) {
                                sc.next();
                                wenttocatch = true;
                                System.out.println("invalid balance!");
                                System.out.println("please enter valid balance");
                        }
                } while (wenttocatch == true);
                userAccount.setBalance(Balance);

                while (i == 0) {
                        int choice = 0;
                        System.out.println("Enter 1 to withdraw and 2 to deposit");
                        choice = sc.nextInt();
                        switch (choice) {
                                case 1:
                                        System.out.println("Enter the amount of money you want to withdraw: ");
                                        double amountToWithdraw = sc.nextDouble();
                                        userAccount.WithDrawMoney(amountToWithdraw);
                                        break;
                                case 2:
                                        System.out.println("Enter the amount of money you want to deposit: ");
                                        double amount = sc.nextDouble();
                                        userAccount.DepositMoney(amount);
                                        break;
                                default:
                                        System.out.println("incorrect choice");
                                        break;

                        }

                        System.out.println("do you wish to continue ,enter 0 to continue else enter 1");
                        i = sc.nextInt();

                }
                System.out.println("Name: " + userAccount.getName());
                System.out.println("Balance: " + userAccount.getBalance());
                System.out.println("Phone Number " + userAccount.getPhoneNumber());
                System.out.println("email address: " + userAccount.getEmail());
                System.out.println("Account Number: " + userAccount.getNumber());

        }
}