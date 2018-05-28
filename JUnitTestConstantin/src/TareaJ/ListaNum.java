package TareaJ;

public class ListaNum 
{
	
	public static int NumMayor(int lista[]) 
	{

		int mayor = 0;
		boolean primero = true;
		
		for (int i : lista) 
		{

			if (primero) 
			{
				mayor = i;
				primero = false;
			}
			else 
				{
				if (i > mayor) 
				{
					mayor = i;
				}
				}
		}
		return mayor;

	}
}

