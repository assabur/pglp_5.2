package fr.uvsq.solid.pglp_5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonnelDao extends DAO<Personnels>
{
	
	/*
	 * 
	 * (non-Javadoc)
	 * @see fr.uvsq.solid.pglp_5.DAO#create(fr.uvsq.solid.pglp_5.Personnels)
	 */
	@Override
	public int create (Personnels obj) 
	{	
		 DbConnection conn=new DbConnection();
		try 
		{
			
		PreparedStatement prepare=conn.getConn().prepareStatement("insert into PERSONNE (id,nom,prenom) values(?,?,?)"); 
		prepare.setInt(1, obj.getId());
		prepare.setString(2,obj.getNom());		
		prepare.setString(3, obj.getPrenom());		
		return prepare.executeUpdate();
		
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return 0;
	}
	/*
	 * (non-Javadoc)
	 * @see fr.uvsq.solid.pglp_5.DAO#find(int)
	 * trouver un objet a travers son id dans la bd
	 */
	@Override
	public Personnels find(int id) 
	{
		DbConnection conn=new DbConnection();
		Personnels p=new Personnels.Builder(0, "", "").build();
		try
		{
			PreparedStatement prepare=conn.getConn().prepareStatement(
					"SELECT * FROM PERSONNE WHERE id=?");
			prepare.setLong(1, id);
			ResultSet result=prepare.executeQuery();
			if(result.first())
			{
				p=new Personnels.Builder(id,result.getString("nom"),result.getString("prenom")).build();
			}	
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return p;
		
	}
	@Override
	
	public void update(int id) {
		
		
	}

	@Override
	public void delete(Personnels obj) {
		
		
		
	}

}
