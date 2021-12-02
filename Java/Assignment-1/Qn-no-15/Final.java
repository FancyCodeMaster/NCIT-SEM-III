public class Final{
    public static void main(String[] args){
        Image img = new Image(650 , 1200 , 1 , "jpeg");
        Product p1 = new Product("Book" , 14565 , img);

        p1.showInfo();

    }
}