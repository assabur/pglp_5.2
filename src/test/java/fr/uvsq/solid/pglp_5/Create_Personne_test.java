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

	private Personnels personnel2;

		
	@Before
	public void setup()
	{
		//creer 4 personnels et 3 composites ensuite les rajouter
		personnel2=new Personnels.Builder(2,"Nikiema", "Daouda").build();

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
