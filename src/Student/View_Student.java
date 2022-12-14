package Student;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class View_Student implements ActionListener{

    JFrame f;
    JTextField t;
    JLabel l1,l2;
    JButton b,b2;

    View_Student(){
        f=new JFrame("View");
        f.setBackground(Color.green);
        f.setLayout(null);

        l1=new JLabel();
        l1.setBounds(0,0,500,270);
        l1.setLayout(null);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("Student/pics/view.jpg"));
        l1.setIcon(img);


        l2=new JLabel("Register Number");
        l2.setVisible(true);
        l2.setBounds(40,60,200,30);
        l2.setForeground(Color.black);
        Font F1 = new Font("serif",Font.BOLD,25);
        l2.setFont(F1); 
        l1.add(l2);
        f.add(l1);


        t=new JTextField();
        t.setBounds(250,60,220,30);
        l1.add(t);

        b=new JButton("Search");
        b.setBounds(240,150,100,30);
        b.addActionListener(this);
        l1.add(b);

        b2=new JButton("Cancel");
        b2.setBounds(360,150,100,30);
        b2.addActionListener(this);
        l1.add(b2);

        f.setSize(500,270);
        f.setLocation(450,250);
        f.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b2){
            f.setVisible(false);
            details d=new details();
        }
        if(ae.getSource()==b){
            f.setVisible(false);
            //String tt= t.getText();
            Print_Data p= new Print_Data(t.getText());
        }

    }

    public static void main(String[]ar){
        View_Student v =new View_Student();
    }
}