public class Student extends Person{
    String name;
    int age;
    String gender;
    int rollNo;
    String level;
    String faculty;

    public Student(String name , int age , String gender , int rollNo , String level , String faculty){
        super(name , 100 , gender);
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.rollNo = rollNo;
        this.level = level;
        this.faculty = faculty;
    }

    public String toString(){
        return this.name;
    }

}