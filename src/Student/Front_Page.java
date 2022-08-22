package Student;
import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*; 

public class Front_Page implements ActionListener{
	JFrame f;
	JLabel id,l1;
	JButton b;
	
	Front_Page()
	{
		f= new JFrame("Student Management System");
		f.setBackground(Color.gray);
		f.setLayout(null);
		
		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("Student/pics/students.jpg"));
		Image i2 =i1.getImage().getScaledInstance(1200,700,Image.SCALE_DEFAULT);
		ImageIcon i3= new ImageIcon(i2);
		JLabel l1= new JLabel(i3);
		l1.setBounds(0,150,1360,530);//x,y,l,b;	
		f.add(l1); 
		
		
		b= new JButton("CLICK HERE TO PROCEED");
		b.setBackground(Color.BLACK);
		b.setForeground(Color.WHITE);
		
		b.setBounds(500,600,300,70); //x,y,l,b;
		b.addActionListener(this);//
		
		id=new JLabel(); 
		id.setBounds(0,0,1360,750);
		id.setLayout(null);
		
		JLabel lid= new JLabel("STUDENT MANAGEMENT SYSTEM");
		lid.setBounds(80,30,1500,100);
		lid.setFont(new Font("serif",Font.PLAIN,70));
		lid.setForeground(Color.red);
		id.add(lid);
		id.add(b);
		f.add(id);
		
		f.getContentPane().setBackground(Color.white);
		
		f.setVisible(true); // to view on frame
		f.setSize(1360,750);
		f.setLocation(200,100);// opens from 200,100 point on screen
		
		while(true)
		{
			lid.setVisible(false); //lid=jlabel
			try
			{
				Thread.sleep(500); // 1000=1sec, 500=0.5 sec 
			}
			catch(Exception e)
			{}
			lid.setVisible(true); 
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{}
		}
	}
	@Override
	//event to be performed when something is clicked.
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==b)
		{
			f.setVisible(false);
			new Login(); 
		}	
		
	}
	public static void main(String args[])
	{
		Front_Page f = new Front_Page();
	}
	
}
