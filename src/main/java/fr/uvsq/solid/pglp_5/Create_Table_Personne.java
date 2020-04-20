package fr.uvsq.solid.pglp_5;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Create_Table_Personne {
	private DbConnection db=new DbConnection();	
	
	public Create_Table_Personne() throws SQLException
	{
		boolean result=db.connection().createStatement().execute("CREATE TABLE  personne (id int primary key,nom varchar(20),prenom varchar(20),age int)");
		if(result)
		System.out.println("table creee avec succes");
	}

}
