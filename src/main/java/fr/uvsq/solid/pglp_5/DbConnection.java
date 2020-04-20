package fr.uvsq.solid.pglp_5;
import java.sql.*;

public class DbConnection {
	
	private static String JDBC_URL="jdbc:derby: PersonneDB;create=true";
	private static final String DRIVER="org.apache.derby.jdbc.EmbeddedDriver";
	//private Connection conn;
	
	//connect 'jdbc:derby:F:\EclipseProjects\patron_conception\pglp_5.2\PersonneDB';
	
	/*
	 * methode permettant de se connecter directemeent à la base de données
	 */
	public static  Connection  connection()
	{
		Connection conn=null;
		try {
			
			Class.forName(DRIVER);			
			conn=DriverManager.getConnection(JDBC_URL);
			if (conn!=null)
			{
				Flash.affiche("connexion au serveur de Bd reuissi");
			}
		} catch (SQLException e )
		{
			Flash.affiche("echec de connexion");
		}
		catch (ClassNotFoundException e) 
		{
			Flash.affiche(e.getMessage());
			Flash.affiche("ERREUR : charger derby.jdbc.EmbeddedDriver ");	       
	    }
		return conn;
	}		
}
