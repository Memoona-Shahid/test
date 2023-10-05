import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Bankaccount B1 = new Bankaccount();
        System.out.println("Enter name of Account holder:");
        Scanner name = new Scanner(System.in);
        B1.name = name.nextLine();
        System.out.println("Enter balance:");
        Scanner sc = new Scanner(System.in);
        B1.balance = sc.nextDouble();
        int choice;
         do{
        System.out.println("ENTER A NUMBER FROM 1 TO 4\n 1)To deposit amount\n 2)To withdraw amount\n 3)To check current balance\n 4)To exit");
            int totalDeposit= 0;
            int totalWithdraw=0;

            Scanner num= new Scanner(System.in);
             choice = num.nextInt();
              if (choice == 1) {
                System.out.println("Enter amount to deposit:");
                Scanner am = new Scanner(System.in);
                Double amount = sc.nextDouble();
                System.out.println("YOUR CURRENT BALANCE IS:");
                B1.deposit(amount);
                totalDeposit=1+totalWithdraw;
            } else if (choice == 2) {
                System.out.println("Enter amount to withdraw:");
                Scanner am = new Scanner(System.in);
                Double amount = sc.nextDouble();
                System.out.println("YOUR REMAINING BALANCE IS:");
                B1.withdraw(amount);
                totalWithdraw= 1 + totalWithdraw;
            } else if (choice == 3) {
                System.out.println("YOUR CURRENT BALANCE IS:");
                B1.showBalance();
            } else {
                System.out.println("program exit");
                System.out.println("ACCOUNT TITLE:" + B1.name);
                System.out.println("BALANCE:" + B1.balance);
                System.out.println("TOTAL NUMBER OF DEPOSITS:"+ totalDeposit);
                System.out.println("TOTAL NUMBER OF WITHDRAWS:"+ totalWithdraw);
            }

        } while( choice != 4);
    }

    }

