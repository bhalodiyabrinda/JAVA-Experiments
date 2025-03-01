/*4. Create a class Bank with method name GetInterestRate()  as a super class. Implement hierarchy 
inheritance with child class ICICI ,SBI,BOB along with method GetInterestRate demonstrate method 
overriding.
*/

class Bank
{
    public void GetInterestRate() 
    {
        System.out.println("Banks");
    }
}

class ICICI extends Bank 
{
    public void GetInterestRate() 
    {
        System.out.println("ICICI Bank");
    }
}

class SBI extends Bank 
{
    public void GetInterestRate() 
    {
        System.out.println("SBI Bank");
    }
}

class BOB extends Bank 
{
    public void GetInterestRate() 
    {
        System.out.println("Bank of Baroda");
    }
}

public class Ex4 {
    public static void main(String[] args) 
    {
        Bank Bank = new Bank();
        ICICI icici = new ICICI();
        SBI sbi = new SBI();
        BOB bob = new BOB();

        Bank.GetInterestRate();
        icici.GetInterestRate();  
        sbi.GetInterestRate();    
        bob.GetInterestRate();     
    }
}
