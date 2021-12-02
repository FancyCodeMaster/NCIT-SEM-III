import java.util.Scanner;
import java.util.InputMismatchException;

public class Transaction{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Welcome to the Payment System. Following are your choices:");
        System.out.println("1 . Debit Card Payment");
        System.out.println("2. Paypal Payment");
        System.out.println("Enter your preferred payment system : ");
        int choice = s1.nextInt();

        switch(choice){
            case 1:
                try{
                    System.out.println("Enter your bank name?");
                    s1.nextLine();
                    String bankName = s1.nextLine();
                    System.out.println("Enter your card number?");
                    int cardNumber = s1.nextInt();
                    System.out.println("Enter your cvv number?");
                    int cvvNumber = s1.nextInt();
                    System.out.println("Enter amount to be paid?");
                    int amount = s1.nextInt();
                    Debit d1 = new Debit(cardNumber , cvvNumber , bankName , amount);
                    d1.provideAccess();
                }catch(InputMismatchException err){
                    System.out.println(err.getMessage());
                }
                break;
            case 2:
                try{
                    System.out.println("Enter your email?");
                    s1.nextLine();
                    String email = s1.nextLine();
                    System.out.println("Enter your password?");
                    String password = s1.nextLine();
                    System.out.println("Enter amount to be paid?");
                    int am = s1.nextInt();
                    Paypal p1 = new Paypal(email , password , am);
                    p1.verifyUser();
                    }catch(InputMismatchException err){
                        System.out.println(err.getMessage());
                    }
                break;
            default:
                System.out.println("Inappropriate Payment System");

        }

    }
}