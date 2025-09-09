 
package bankapp;
import com.example.BankAccount;
import java.util.Scanner;

public class BankApp 
{

 
    public static void main(String[] args)
    {
      Scanner kb = new Scanner(System.in);
      
      String name;
      int choice= -1;
      double amount = 0;
      
       System.out.println("Enter account holder name: ");
       name=kb.nextLine();
       
       BankAccount account = new BankAccount(name,0);
       
       while(choice != 0)
       {
           System.out.println("\n ====Mashaba Bank Menu====");
           System.out.println("1.Deposit");
           System.out.println("2.Withdraw");
           System.out.println("3.Check Balance");
           System.out.println("0.Exit");
           System.out.println("Choose option:");
           
           if (kb.hasNextInt())
           {
               System.out.println("Enter a valid number!");
               kb.next();//skip invalid input
               continue;
               
           }
           choice=kb.nextInt();
           
           switch(choice)
           {
               case 1 ->{
               System.out.println("Enter amount to deposit R:");
               amount=kb.nextDouble();
               account.deposit(amount);
               }
               
               case 2 ->{
               System.out.println("Enter amount to withdraw R:");
               amount=kb.nextDouble();
               account.equals(amount);
               }
               
                case 3 -> System.out.println("Balance R:" +account.getBalance());
                
               
                case 0->System.out.println("GoodBye!");
               
               
                default->System.out.print("Invalid choice");
               
           }
       }
       
    }
    
}
