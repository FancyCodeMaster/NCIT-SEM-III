public class Computer{
    String company;
    int price;
    Memory m1;

    public Computer(String company ,int price , Memory m1){
        this.company = company;
        this.price = price;
        this.m1 = m1;
    }

    public void showInfo(){
        System.out.println("Company name : " + this.company +  "\n Computer Price : " + this.price + "\nMemory name : " + m1.getMemoryCompany() + "\nMemory Type : " + m1.getMemoryType() + "\nMemory Price : " + m1.getMemoryPrice());

    }
}