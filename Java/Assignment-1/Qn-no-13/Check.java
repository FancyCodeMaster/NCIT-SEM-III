public class Check{
    public static void main(String[] args){
        int num = 100;
        System.out.println("Square of " + num + " is " + returnSquare(num));

        Hello h1 = new Hello("What's up?" , 2021);
        h1.showMessage();

    }
    public static int returnSquare(int num){
        return num*num;
        // here num is the local variable as its scope remains only inside this block of code
    }
}

class Hello{
    String message; // message is instance variable as in every object of Hello class message will be different and will be placed in different memory location
    static int year = 2078; // year is class variable. Irrespective of the number of object creation , year will have only one copy thus class variable
    public Hello(String msg , int year){
        this.message = msg;
        this.year = year;
    }
    public void showMessage(){
        System.out.println("Current Year : " + this.year);
        System.out.println(this.message);
    }
}
