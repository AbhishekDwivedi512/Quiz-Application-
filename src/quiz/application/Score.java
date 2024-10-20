package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    
    Score(String name,int score){
        setBounds(350,150,750,550); 
       
        getContentPane().setBackground (Color.WHITE);
        setLayout(null);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2=i1.getImage().getScaledInstance(300, 250,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);
        
        
        JLabel heading =new JLabel("Thankyou " +name + " for playing Simple Minds");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(heading);
        
        JLabel lblscore =new JLabel("Your score is "+score);
        lblscore.setBounds(350,200,300,30);
        lblscore.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(lblscore);
        
        JButton Submit =new JButton("play Again");
        Submit.setBounds(350, 270, 120, 30);
        Submit.setBackground(new Color(30,140,255));
        //Submit.setForeground(Color.WHITE);
        Submit.addActionListener(this);
        add(Submit);
        
        
        setVisible(true);
        
    }   
     public void actionPerformed(ActionEvent ae){
         setVisible(false);
         new Login();
         
     }
    public static void main(String[]args){
        new Score("User",0);
    }
    
}
