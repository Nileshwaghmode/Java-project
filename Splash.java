
package tourism.management.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame{
    Splash() {
        setSize(1200,600);
        setLocation(200,100);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/splash.jpg"));
        Image i2=i1.getImage().getScaledInstance(1200, 600, Image.SCALE_DEFAULT);
        JLabel image=new JLabel(i1);
        add(image);
        setVisible(true);
    }
   
    public static void main(String[] args)
    {
        new Splash();
    }
}
