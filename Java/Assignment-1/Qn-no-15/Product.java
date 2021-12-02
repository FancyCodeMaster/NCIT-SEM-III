public class Product{
    private String name;
    private int id;
    private Image img;

    public Product(String name , int id , Image img){
        this.name = name;
        this.id = id;
        this.img = img;
    }

    public void showInfo(){
        System.out.println("Product name : " + this.name);
        System.out.println("Product id : " + this.id);
        System.out.println("Product Image info : ");
        System.out.println("Image Dimension : " + this.img.getDim());
        System.out.println("Image Type : " + this.img.getType());
        System.out.println("Image Color : " + this.img.getColor());
    }

}