import java.sql.SQLOutput;
import java.util.Scanner;

public class Bankaccount {
    Double balance;
    String name;
    public void deposit(Double amount)
    {
       if(this.balance<100000)
       {
         this.balance=  ((amount*1)/100)+amount+this.balance;
       }
       else {
           this.balance = amount + this.balance;
           System.out.println(this.balance);
       }

    }
    public void withdraw(Double amount)
    {
        if(this.balance<50000)
        {
            this.balance= this.balance-((2*amount)/100);
        }
        if((this.balance-amount)<50000) {
            System.out.println("ARE YUH SURE TO PERFORM THIS TRANSACTION PRESS 0 FOR YES 1 FOR NO");
            Scanner o = new Scanner(System.in);
            int choice = o.nextInt();
            if (choice == 1) {
                this.balance = this.balance - ((2 * amount) / 100);
                System.out.println("TRANSACTION IS PERFORMED AND YOUR REMAINING BALANCE IS:");
                System.out.println(this.balance);
            } else if (choice == 0) {
                System.out.println("TRANSACTION IS NOT PERFORMED");
            } else
                System.out.println("ENTER VALID NUMBER");
        }
        else {
            this.balance = this.balance - amount;
            System.out.println(this.balance);
        }
    }
    public void showBalance()
    {
        System.out.println(this.balance);
    }
}
