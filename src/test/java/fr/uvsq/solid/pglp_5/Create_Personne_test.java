package fr.uvsq.solid.pglp_5;
import java.util.ArrayList;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import org.junit.Before;
import org.junit.Test;

import fr.uvsq.solid.pglp_5.Personnels.Builder;
public class Create_Personne_test
{
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
	public void create_test()
	{	
		//System.out.println("objet creer avec succes ");
		int a=FabriqueDAO.getPersonneDAO().create(personnel2);
		if(a==1)
		System.out.println("objet creer avec succes ");
	}

}
