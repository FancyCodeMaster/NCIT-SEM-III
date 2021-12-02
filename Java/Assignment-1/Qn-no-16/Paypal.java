public class Paypal extends Payment{
    private String email , password;

    public Paypal(String email , String password , int amount){
        super(amount);
        this.email = email;
        this.password = password;
    }

    public void verifyUser(){
        if(this.email == "rikesh.191634@paypal.com" && this.password == "Ncit@191634"){
            super.getReceipt();
        }
    }

}