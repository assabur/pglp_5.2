package fr.uvsq.solid.pglp_5;
import java.sql.*;

public class DbConnection {
	
	private static String JDBC_URL="jdbc:derby:PersonneDB;create=true";
	private static final String DRIVER="org.apache.derby.jdbc.EmbeddedDriver";
	private Connection conn;
	
	//connect 'jdbc:derby:F:\EclipseProjects\patron_conception\pglp_5.2\PersonneDB';
	
	/*
	 * constructeur permettant de se connecter directemeent à la base de données
	 */
	public  DbConnection()
	{
		try {
			
				Class.forName(DRIVER);
			
			this.conn=DriverManager.getConnection(JDBC_URL);
			if (this.conn!=null)
			{
				System.out.println("connexion au serveur de Bd reuissi");
			}
		} catch (SQLException e )
		{
			System.out.println("echec de connexion");
		}
		catch (ClassNotFoundException e) 
		{
	        System.out.println(e.getMessage());
	        System.out.println("ERREUR : charger derby.jdbc.EmbeddedDriver ");
	       
	    }
	}
		
	public Connection getConn() 
	{
		return conn;
	}
	

}
