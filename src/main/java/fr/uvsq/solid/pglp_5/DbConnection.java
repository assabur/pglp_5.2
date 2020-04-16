package fr.uvsq.solid.pglp_5;
import java.sql.*;

public class DbConnection {
	
	private static String JDBC_URL="jdbc:derby:PersonneDB;create=true";
	private static final String DRIVER="org.apache.derby.jdbc.EmbeddedDriver";
	Connection conn;
	public  DbConnection()
	{
		try {
			
			this.conn=DriverManager.getConnection(JDBC_URL);
			if (this.conn!=null)
			{
				System.out.println("connexion au serveur de Bd reuissi");
			}
		} catch (SQLException e)
		{
			System.out.println("echec de connexion");
		}
	}
			

}
