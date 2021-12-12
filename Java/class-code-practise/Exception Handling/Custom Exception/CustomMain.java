public class CustomMain{
    public static void main(String[] args){
        try{
            ExceptionCheck c1 = new ExceptionCheck("Rikesh" , 100);
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }
    }
}