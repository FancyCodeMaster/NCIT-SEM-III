public class Image{
    private int width , height , colorValue;
    private String dimension , type , color;

    public Image(int width , int height , int color , String type){
        this.dimension = width + "*" + height;
        this.type = type;
        if(color == 1){
            this.color = "Colored";
        }else{
            this.color = "Black and White";
        }
    }

    public String getDim(){
        return this.dimension;
    }

    public String getType(){
        return this.type;
    }

    public String getColor(){
        return this.color;
    }

}
