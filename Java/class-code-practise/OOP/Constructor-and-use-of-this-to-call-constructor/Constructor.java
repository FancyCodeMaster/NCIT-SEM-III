public class Constructor{
    public static void main(String[] args){
        Shape s1 = new Shape(10,20,30,40);
        Shape s2 = new Shape(50,60);
        Shape s3 = new Shape();

        s1.showInfo();
        s2.showInfo();
        s3.showInfo();
    }
}