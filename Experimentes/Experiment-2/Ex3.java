/*3.Design a class to represent a bank account. Which contains account number, name
 of the depositor, type of the account, balance amount in the account. Use 
 constructors to assign initial values, to Deposit an amount, to Withdraw amount 
 after checking balance, to display name and balance.
 */
class BankAccount 
{
    int accountNumber;
    String accountHolderName;
    String accountType;
    double balance;

    BankAccount(int accountNumber, String accountHolderName, String accountType, double balance) 
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void deposit(double amount) 
    {
        if (amount > 0) 
        {
            balance += amount;
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw an amount after checking balance
    public void withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    public void displayAccountInfo() 
    {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}
public class Ex3
{
    public static void main(String[] args) 
    {
        BankAccount account = new BankAccount(12345, "John", "Savings", 1000.0);

        System.out.println("Account Information:");
        account.displayAccountInfo();

        account.deposit(500.0);
        account.withdraw(200.0);

        System.out.println("\nUpdated Account Information:");
        account.displayAccountInfo();
    }
}
