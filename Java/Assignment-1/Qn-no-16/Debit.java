public class Debit extends Payment{
    private int cardNumber , cvvNumber;
    private String bankName;

    public Debit(int cardNumber , int cvvNumber , String bankName , int amount){
        super(amount);
        this.cardNumber = cardNumber;
        this.cvvNumber = cvvNumber;
        this.bankName = bankName;
    }

    public void provideAccess(){
        if(this.cardNumber == 200565656 && this.cvvNumber == 1145656 && this.bankName == "Mega"){
            super.getReceipt();
        }
    }

}