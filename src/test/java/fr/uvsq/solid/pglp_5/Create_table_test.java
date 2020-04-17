package fr.uvsq.solid.pglp_5;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

public class Create_table_test {
		

	@Test
	public void create_test()
	{		
		try 
		{
			Create_Table_Personne personne=new Create_Table_Personne();
			
		} catch (SQLException e) 
		{	
			e.printStackTrace();
		}	
	}
}
