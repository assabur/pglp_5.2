package fr.uvsq.solid.pglp_5;

import java.sql.Connection;

/*
 * classe abstraite des differentes methodes du CRUD
 */
public abstract class DAO<T> 
{
	public Connection conn;
	public abstract int create (Personnels obj);
	public abstract T find (int id);
	public abstract int update (int obj,String nom,String prenom);
	public abstract int delete(int id);
}
