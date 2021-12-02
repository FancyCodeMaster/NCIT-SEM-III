import java.util.Scanner;

public class Shop{
    public static void main(String[] args){
        System.out.println("Welcome to the shop.");
        System.out.println("Which pizza would you like to try?");
        System.out.println("1. Standard Pizza");
        System.out.println("2. Deluxe Pizza");

        Scanner s1 = new Scanner(System.in);

        int choice = s1.nextInt();

        switch(choice){
            case 1:
                System.out.println("Enter the number of pizza you want to order?");
                int standardNumber = s1.nextInt();
                StandardPizza sp = new StandardPizza(standardNumber);
                sp.getOrder();
                break;
            case 2:
                System.out.println("Enter the number of pizza you want to order?");
                int deluxeNumber = s1.nextInt();
                System.out.println("Would you like toppings on them?");
                Boolean toppings = s1.nextBoolean();
                if(toppings){
                    System.out.println("How many toppings would you prefer?");
                    int toppingsNum = s1.nextInt();
                    DeluxePizza d1 = new DeluxePizza(deluxeNumber , toppingsNum);
                    d1.getOrder();
                }else{
                    DeluxePizza d2 = new DeluxePizza(deluxeNumber , 0);
                    d2.getOrder();
                }
                break;
            default:
                System.out.println("No such pizza available");
        }

    }
}