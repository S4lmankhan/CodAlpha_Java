import java.util.Scanner;

public class ATM {
    private static double balance = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        System.out.println("Thank you for using the Simple Banking Application!");
    }

    public static void deposit(double amount) {
        balance += amount;
        System.out.println("Thank You Sir You've Successfully Deposited: $" + amount);
        System.out.println("The Total Balance Now is :"+balance);
    }

    public static void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Hoorayyy You Have Withdrawn: $" + amount);
            System.out.println("The Remaining Balance Now is :"+balance);

        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    public static void checkBalance() {
        System.out.println("Sir Your Current Balance is : $" + balance);
    }
}
