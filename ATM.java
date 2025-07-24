import java.util.*;

public class ATM
{
    int balance=1000;
    public void Balance()
    {
        System.out.printf("\nThe balance of this account is\n"+balance);
    }
    
    public void deposit(int amount)
    {
        balance=balance+amount;
        System.out.printf("\nThe total amount of this account after deposit is"+balance);
    }
    
    public void withdraw(int amount)
    {
        if(amount<=balance){
            balance=balance-amount;
            System.out.printf("\nThe total amount of this account after withdraw is"+balance);
        }else{
            System.out.println("No Balance");
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ATM atm=new ATM();
        while(true){
        System.out.println("\nChoose one which you needed \n1.check the balance\n2.Deposit Money\n3.Withdraw Money \n4.Exit");
        int ch=sc.nextInt();
        
        switch(ch)
        {
            case 1-> atm.Balance();
            case 2 -> {
                    System.out.println("Enter amount to deposit: ");
                    atm.deposit(sc.nextInt());
            }
            case 3->  {
                    System.out.println("Enter amount to With draw");
                    atm.withdraw(sc.nextInt());}
            case 4-> {System.out.println("Thank you for using ATM!");
            return;}
            default-> System.out.println("Invalid choice!!");
        }
        }
    }
}