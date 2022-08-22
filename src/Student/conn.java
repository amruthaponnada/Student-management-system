package Student;
import java.sql.*;
import javax.swing.*;

public class conn {
	public Connection c;
	public Statement s;
	
	public conn()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c= DriverManager.getConnection("jdbc:mysql://localhost:3306/amrutha","root","");
			s = c.createStatement();//through this we execute our queries.
			//JOptionPane.showMessageDialog(null,"connection established");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error in connecting to database");
		}
	}
	

}
