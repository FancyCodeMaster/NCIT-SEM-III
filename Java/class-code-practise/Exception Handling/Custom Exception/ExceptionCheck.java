public class ExceptionCheck{
    String name;
    int sem;
    public ExceptionCheck(String name , int sem) throws CustomException{
        if(sem<1 || sem>8){
            throw new CustomException("Semester can't be less than 1 and can't be greater than 8.");
        }else{
            this.name = name;
            this.sem = sem;
        }
    }

    public void showInfo(){
        System.out.println("Name : " + this.name);
        System.out.println("Semester : " + this.sem);
    }
}