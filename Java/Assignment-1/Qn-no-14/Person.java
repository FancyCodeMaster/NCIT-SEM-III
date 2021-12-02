public class Person{
    private String name;
    private double height;
    private String address;

    public Person(String name , double height , String address){
        this.name = name;
        this.height = height;
        this.address = address;
    }

    public String toString(){
        return this.name;
    }
}