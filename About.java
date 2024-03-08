
package tourism.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener{
    
    About(){
        setBounds(600,200,500,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel l1=new JLabel("About");
        l1.setBounds(200,10,100,40);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l1);
        
        String s="About Projects     \n"+ "\n" + "Tourism has turned out to be an economic booster contributing to the economic development of many countries over the last few decades. People see holidays as a necessity, and not as luxury in the present scenario. Tourism calls for coordination and cooperation between travel agents, tour operators, and tourists. Tourism has a few major elements − destinations, attractions, sites, accommodation, and all ancillary services."+"\n"+"The most common reasons for the people to travel away from home are −\n" +
"\n" +
"To spend holidays leisurely\n" +
"To visit friends and relatives\n" +
"To attend business and professional engagements\n" +
"To get health treatment\n" +
"To undertake religious pilgrimages\n" +
"Any other personal motives";
        
        TextArea area=new TextArea(s,10,40,Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20,100,450,300);
        add(area);
        
        JButton back=new JButton("Back");
        back.setBounds(200,420,100,25);
        back.addActionListener(this);
        add(back);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
    }
    
    public static void main(String[] args){
        new About();
    }
}
