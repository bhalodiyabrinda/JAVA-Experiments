import java.sql.*;
calss j1
{
	public static void main(String s[])
	{
		Result rs;
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

			Connection con = DriverManager.getConnection("jdbc:odbc:btech")

			Statement stat = con.createStatement();

			Result rs stat.executeQuery ("Select*from btech3")

			while(rs.next())
			{
				System.out.println("Roll No:"+rs.getInt(1));
				System.out.println("Student Name:"+ rs.getString(2));
			}
		}
		catch(Exception e)
		{
			System.out.println(e):

		}
	}
}