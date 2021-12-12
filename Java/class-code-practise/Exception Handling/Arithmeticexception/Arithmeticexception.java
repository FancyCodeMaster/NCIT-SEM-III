public class Arithmeticexception{
    public static void main(String[] args){
        int a = 50;

        try{
            a = a/0;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
            // System.out.println("Can't be divided by zero");
        }

    }
}