package fr.uvsq.solid.pglp_5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonnelDao extends DAO<Personnels>
{
	private DbConnection connection=new DbConnection();
	
	/*
	 * 
	 * (non-Javadoc)
	 * @see fr.uvsq.solid.pglp_5.DAO#create(fr.uvsq.solid.pglp_5.Personnels)
	 */
	@Override
	/*public Personnels create (Personnels obj) 
	{	
		try 
		{
			
		/*PreparedStatement prepare=connect.prepareStatement(
				'INSERT INTO personne (nom,prenom,age) VALUES (?,?,?);' 
				);*/
			
		PreparedStatement prepare=PreparedStatement 
		prepare.setString(1,obj.getNom());
		prepare.setInt(3, obj.getAge());
		prepare.setString(2, obj.getAge());
		int result=preapare.executeUpdate();
		assert result ==1;
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public Personnels find(int id) 
	{
		
	}

	@Override
	public void update(int id) {
		
		
	}

	@Override
	public void delete(Personnels obj) {
		
		
		
	}

}
