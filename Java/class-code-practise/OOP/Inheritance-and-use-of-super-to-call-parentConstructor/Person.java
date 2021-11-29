public class Person{
    String name;
    int age;
    String gender;
    
    public Person(String name , int age , String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName(){
        return this.name;
    }

    public String gender(){
        return this.gender;
    }

    public int getAge(){
        return this.age;
    }

}