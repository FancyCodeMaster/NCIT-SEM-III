public class Pizza{
    private int price;
    private int numberOfPizza;
    private int numberOfToppings;
    private Boolean offer;

    public Pizza(int deluxeNumber , int toppings){
        if(deluxeNumber < 5){
            this.numberOfToppings = toppings;
            this.price = deluxeNumber*200 + toppings * 20;
            this.offer = false;
        }else{
            this.offer = true;
            this.price = (deluxeNumber - 1) * 200 + toppings * 20;
        }
        this.numberOfPizza = deluxeNumber;

    }

    public Pizza(int standardNumber){
        if(standardNumber < 5){
            this.price = standardNumber*100;
            this.offer = false;
        }else{
            this.offer = true;
            this.price = (standardNumber - 1) * 100;
        }
        this.numberOfPizza = standardNumber;

    }

    public void getOrder(){
        System.out.println("Thanks for your order.");
        System.out.println("Number of Pizza : " + this.numberOfPizza);
        if(this.offer){
            System.out.println("Offer : Buy 5 Get 1 Free");
        }

        if(this.numberOfToppings >= 0){
            System.out.println("Toppings : " + this.numberOfToppings);
        }
        System.out.println("Total Price : Rs." + this.price);
    }



}