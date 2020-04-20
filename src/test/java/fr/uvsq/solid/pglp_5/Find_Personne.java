package fr.uvsq.solid.pglp_5;

import org.junit.Before;
import org.junit.Test;

public class Find_Personne {

	private Composite_Personnel composite1=new Composite_Personnel(1);
	private Composite_Personnel composite3=new Composite_Personnel(3);
	private Composite_Personnel composite4=new Composite_Personnel(4);
	private Personnels personnel2;
	private Personnels personnel6;
	private Personnels personnel7; 
	private Personnels personnel5;
		
	@Before
	public void setup()
	{
		//creer 4 personnels et 3 composites ensuite les rajouter
		personnel2=new Personnels.Builder(2,"Nikiema", "Daouda").build();
		personnel6 =new Personnels.Builder(6,"Maiga", "Rahim").build();
		personnel7 =new Personnels.Builder(7,"Seni", "Allasane").build();
		personnel5 =new Personnels.Builder(5,"Barro ", "Drissa").build();
		
	}
	@Test
	public void find_test()
	{	
		FabriqueDAO.getPersonneDAO().find(2).toString();
		System.out.println("Nom :"+FabriqueDAO.getPersonneDAO().find(2).getNom()+
				"\nPrenom :"+FabriqueDAO.getPersonneDAO().find(2).getPrenom());	
	}
}
