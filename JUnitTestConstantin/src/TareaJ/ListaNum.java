package TareaJ;
/**
 * Clase ListaNum
 *
 * Muestra el numero mayor de un array de numeros
 *
 * @author Constantin Dragos
 * @version 1.0
 */

public class ListaNum 
{
	//Metodos publicos
 
    /**
     * Comprueba cual numero es mayor
     * @param lista
     * @return <ul>
     *          <li>t numero mayor </li>
     *          </ul>
     */
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

