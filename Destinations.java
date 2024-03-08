
package tourism.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class Destinations extends JFrame{
 
  JButton next;
        Destinations(){
        setBounds(500,150,800,530);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/dest1.jpg"));
        Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(50,20,200,200);
        add(image);
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("Icons/dest3.jpg"));
        Image i5=i4.getImage().getScaledInstance(230,230,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel image2=new JLabel(i6);
        image2.setBounds(250,20,200,200);
        add(image2);
        
        ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("Icons/dest4.jpg"));
        Image i8=i7.getImage().getScaledInstance(230,230,Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i8);
        JLabel image3=new JLabel(i9);
        image3.setBounds(450,20,200,200);
        add(image3);
        
        ImageIcon i10=new ImageIcon(ClassLoader.getSystemResource("Icons/dest5.jpg"));
        Image i11=i10.getImage().getScaledInstance(230,230,Image.SCALE_DEFAULT);
        ImageIcon i12=new ImageIcon(i11);
        JLabel image4=new JLabel(i12);
        image4.setBounds(50,200,200,200);
        add(image4);
        
        ImageIcon i13=new ImageIcon(ClassLoader.getSystemResource("Icons/dest6.jpg"));
        Image i14=i13.getImage().getScaledInstance(230,230,Image.SCALE_DEFAULT);
        ImageIcon i15=new ImageIcon(i14);
        JLabel image5=new JLabel(i15);
        image5.setBounds(250,200,200,200);
        add(image5);
        
        ImageIcon i16=new ImageIcon(ClassLoader.getSystemResource("Icons/dest8.jpg"));
        Image i17=i16.getImage().getScaledInstance(230,230,Image.SCALE_DEFAULT);
        ImageIcon i18=new ImageIcon(i17);
        JLabel image6=new JLabel(i18);
        image6.setBounds(450,200,200,200);
        add(image6);
        
        
    
        setVisible(true);
        }
        public static void main(String[] args){
        new Destinations();
    }
}


