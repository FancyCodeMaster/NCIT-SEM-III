// to take input in java we have to import Scanner class from util
import java.util.Scanner;

public class Input{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);

        System.out.println("\nEnter your name?");
        String name = s1.nextLine();

        System.out.println("Enter your age?");
        int age = s1.nextInt();

        System.out.println("\nName : " + name + "\nAge : " + age);

    }
}