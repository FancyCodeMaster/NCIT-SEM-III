public class Composition{
    public static void main(String[] args){
        Memory m1 = new Memory("Intel" , "SSD" , 8000);
        Computer c1 = new Computer("Apple" , 12000 , m1);

        c1.showInfo();
    }
}