/**
 * @author Orlando
 * @author Brandon Hernández 19376
 * @version 30/01/2020
 * @since 30/01/2020
 *
 * Contrato de un stack
 */
import java.util.ArrayList;

public class Stack<E>{

	private ArrayList<E> stack = new ArrayList<E>();

	/**
	* Agrega un dato al stack sin importar cuantos datos hay
	* @post se le agrega un elemento al stack
	*/
	public void push(E item){
		stack.add(item);
	}

	/**
	* Elimina un elemento del stack
	* @pre hay por lo menos un elemento en el stack
	* @post elimina el ultimo elemento del stack
	* @return el elemento eliminado del stack
	*/
	public E pop(){
		return stack.remove(stack.size() - 1);
	}

	/**
	* Ve el ultimo dato que ingreso el usuario
	* @pre hay por lo menos un elemento en el stack
	* @return el ultimo dato que se ingreso al stack
	*/
	public E peek(){
		return stack.get(stack.size() - 1);
	}

	/**
	* Verifica si el stack esta vacio o esta lleno
	* @return true o flase
	*/
	public boolean empty(){
		return stack.isEmpty();
	}

	/**
	* Consiguiendo el tamaño del stack
	* @return como un int el tamaño del stack 
	*/
	public int size(){
		return stack.size();
	}
}