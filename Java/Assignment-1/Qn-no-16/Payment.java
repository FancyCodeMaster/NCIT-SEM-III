public class Payment{
    private static int amount;

    public Payment(int amount){
        this.amount = amount;
    }

    public void getReceipt(){
        System.out.println("Total Amount billed : " + amount);
    }

}