import java.awt.*;

public class Components extends Frame{
    public Components(){
        setSize(500,600);
        setTitle("New Frame");
        Label l1 = new Label("Name");
        l1.setBounds(20 , 50 , 50 , 25);
        TextField tf = new TextField("Name");
        tf.setBounds(300 , 50 , 150 , 25);
        add(l1);
        add(tf);
        setLayout(null);
        setVisible(true);
    }
}