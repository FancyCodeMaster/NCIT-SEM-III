public class Shape{
    private double xCoord , yCoord , width , height;
    
    public Shape(double x , double y , double w , double h){
        this.xCoord = x;
        this.yCoord = y;
        this.width = w;
        this.height = h;
    }

    public Shape(double w , double h){
        this(0,0,w,h);
    }

    public Shape(){
        this(0,0,1,1);
    }

    public void showInfo(){
        System.out.println("X-coordinate : " + this.xCoord);
        System.out.println("Y-coordinate : " + this.yCoord);
        System.out.println("Width : " + this.width);
        System.out.println("Height : " + this.height);
    }
}