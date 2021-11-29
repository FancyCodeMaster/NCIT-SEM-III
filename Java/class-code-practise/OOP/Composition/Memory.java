public class Memory{
    String company , type;
    int price;

    public Memory(String company , String type , int price){
        this.company = company;
        this.type = type;
        this.price = price;
    }

    public String getMemoryCompany(){
        return this.company;
    }

    public String getMemoryType(){
        return this.type;
    }

    public int getMemoryPrice(){
        return this.price;
    }
}