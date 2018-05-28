package Test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import TareaJ.ListaNum;

class TestNum 
{

	@Test
	public void NumMayorTest() 
	{
		int[] testData = new int[] {2, 6, 8, 9};
		int resultado=9;
		assertEquals(resultado, ListaNum.NumMayor(testData));
		
	}
	
	@Test
	public void NumMayorMedioTest() 
	{
		int[] testData = new int[] {2, 6, 9, 8, 1};
		int resultado=9;
		assertEquals(resultado, ListaNum.NumMayor(testData));
		
	}
	@Test
	public void NumMayorNegativoTest() 
	{
		int[] testData = new int[] {-2, -6, -9, -8, -1};
		int resultado=-1;
		assertEquals(resultado, ListaNum.NumMayor(testData));
		
	}
	public void NumMayorIgualesTest() 
	{
		int[] testData = new int[] {-1, -1, -1, -1, -1};
		int resultado=-1;
		assertEquals(resultado, ListaNum.NumMayor(testData));
		
	}
	
}

