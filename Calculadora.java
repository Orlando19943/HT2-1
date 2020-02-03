/**
 * @author Orlando
 * @author Brandon Hernández 19376
 * @version 30/01/2020
 * @since 30/01/2020
 *
 * Implementación de una calculadora
 */
public class Calculadora implements iCalculadora  {	
 
	/**
	* Suma dos números
	* @post crea un número resultante de la suma de los dos enviados
	* @param numero1 es el primer número que se sumara con el segundo
	* @param numero2 es el segundo número que se sumara con el primero
	* @return devuelve la suma de los dos números
	*/
	public int suma(int numero1, int numero2){
		return numero1 + numero2;
	}

	/**
	* Resta dos números
	* @post crea un número resultante de la resta de los dos enviados
	* @param numero1 es el primer número que sera restado con el segundo
	* @param numero2 es el segundo número que se restara del primero
	* @return devuelve la resta de los dos números
	*/
	public int resta(int numero1, int numero2){
		return numero1 - numero2;
	}

	/**
	* Multiplicacion dos números
	* @post crea un número resultante de la multiplicacion de los dos enviados
	* @param numero1 es el primer número que se multliplicara con el segundo
	* @param numero2 es el segundo número que se multiplicara con el primero
	* @return devuelve la multilplicacion de los dos números
	*/
	public int multiplicacion(int numero1, int numero2){
		return numero1*numero2;
	}

	/**
	* Division dos números (verifica que el dividendo no sea 0)
	* @post crea un número resultante de la division de los dos enviados
	* @param numero1 es el primer número es el divisor
	* @param numero2 es el segundo número es el dividendo
	* @return devuelve la division de los dos números
	*/
	public int division(int numero1, int numero2){
		try{
			return numero1/numero2;
		}catch(ArithmeticException e){
			return 0;
		}
	}
}