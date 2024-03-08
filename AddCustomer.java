
package tourism.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AddCustomer extends JFrame implements ActionListener{
    
    JLabel labelusername;
    static JComboBox comboid=new JComboBox();
    JTextField tfnumber,tfaddress,tfcountry,tfemail,tfphone;
    JRadioButton rmale,rfemale;
    JButton Add,back;
    
    AddCustomer(String username){
        setBounds(450,200,850,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel lblusername=new JLabel("Username");
        lblusername.setBounds(30,50,150,25);
        add(lblusername);
        
        labelusername=new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);
        
        JLabel lblid=new JLabel("ID");
        lblid.setBounds(30,90,150,25);
        add(lblid);
   
        String s1[]={"Passport","Aadhar card","Pan card","Ration card"};
        comboid=new JComboBox(s1);
        comboid.setBounds(220,90,150,25);
        comboid.setBackground(Color.WHITE);
        add(comboid);
        
        JLabel lblnumber=new JLabel("Number");
        lblnumber.setBounds(30,140,150,25);
        add(lblnumber);
        
        tfnumber=new JTextField();
        tfnumber.setBounds(220,140,150,25);
        add(tfnumber);
        
        JLabel lblgender=new JLabel("Gender");
        lblgender.setBounds(30,190,150,25);
        add(lblgender);
        
        rmale=new JRadioButton("Male");
        rmale.setBounds(220,190,70,25);
        rmale.setBackground(Color.WHITE);
        add(rmale);
        
        rfemale=new JRadioButton("Female");
        rfemale.setBounds(300,190,70,25);
        rfemale.setBackground(Color.WHITE);
        add(rfemale);
        
        ButtonGroup bg=new ButtonGroup();
        bg.add(rmale);
        bg.add(rfemale);
        
        JLabel lblcountry=new JLabel("Country");
        lblcountry.setBounds(30,250,150,25);
        add(lblcountry);
        
        tfcountry=new JTextField();
        tfcountry.setBounds(220,250,150,25);
        add(tfcountry);
        
        JLabel lbladdress=new JLabel("Address");
        lbladdress.setBounds(30,290,150,25);
        add(lbladdress);
        
        tfaddress=new JTextField();
        tfaddress.setBounds(220,290,150,25);
        add(tfaddress);
        
        JLabel lblphone=new JLabel("Phone");
        lblphone.setBounds(30,330,150,25);
        add(lblphone);
        
        tfphone=new JTextField();
        tfphone.setBounds(220,330,150,25);
        add(tfphone);
        
        JLabel lblemail=new JLabel("Email");
        lblemail.setBounds(30,370,150,25);
        add(lblemail);
        
        tfemail=new JTextField();
        tfemail.setBounds(220,370,150,25);
        add(tfemail);
        
        Add=new JButton("Add");
        Add.setBackground(Color.BLACK);
        Add.setForeground(Color.WHITE);
        Add.setBounds(70,430,100,25);
        Add.addActionListener(this);
        add(Add);
        
        back=new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(220,430,100,25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/newcustomer.jpg"));
        Image i2=i1.getImage().getScaledInstance(400,500,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(400,40,450,420);
        add(image);
        
        try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from account where username='"+username+"'");
            
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==Add){
            String username=labelusername.getText();
            String id=(String)comboid.getSelectedItem();
            String number=tfnumber.getText();
            String gender=null;
            if(rmale.isSelected()) {
                gender="male";
            }
            else{
                gender="female";
            }
            String country=tfcountry.getText();
            String address=tfaddress.getText();
            String phone=tfphone.getText();
            String email=tfemail.getText();
            
            try{
                Conn c=new Conn();
                String query="Insert into customer values('"+username+"','"+id+"','"+number+"','"+gender+"','"+country+"','"+address+"','"+phone+"','"+email+"')";
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null,"Customer details added successfully");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
                
        }else {
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new AddCustomer("String username");
    }
}
