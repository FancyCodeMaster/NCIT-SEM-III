public class Shape{
    int x , y , l , w;

    // remember this() calls the constructor of the same class
    public Shape(int x , int y , int l , int w){
        this.x = x;
        this.y = y;
        this.l = l;
        this.w = w;
    }

    public Shape(int l , int w){
        this(0,0,l,w);
    }

    public Shape(){
        this(0,0,1,1);
    }

    public void showInfo(){
        System.out.println("x : " + x + "\ny : " + y + "\nl : " + l + "\nw : " + w);
    }

}