package fr.uvsq.solid.pglp_5;

import org.junit.Before;
import org.junit.Test;

public class deleteTest {


	private Personnels personnel2;

		
	@Before
	public void setup()
	{
		//creer 4 personnels et 3 composites ensuite les rajouter
		personnel2=new Personnels.Builder(2,"Nikiema", "Daouda").build();
		
	}
	@Test
	public void delete_test()
	{	
		if(FabriqueDAO.getPersonneDAO().delete(2)==1)
		{
			Flash.affiche("suppresion reuissie");
		}

	}}
