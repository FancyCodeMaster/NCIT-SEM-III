import java.awt.*;
import java.awt.event.*;

public class ButtonEvent extends Frame implements ActionListener{
    TextField t1;
    public ButtonEvent(){
        setSize(400,500);
        setTitle("Button Events");
        t1 = new TextField("Hello");
        t1.setBounds(150 , 100 , 100 , 25);
        Button b1 = new Button("Click Me!");
        b1.setBounds(150 , 400 , 70 , 25);
        add(b1);
        add(t1);
        setVisible(true);
        setLayout(null);
        b1.addActionListener(this);// action listener function yai class vitra xa vaneko
    }

    public void actionPerformed(ActionEvent e){
        t1.setText("Button Clicked");
    }
}