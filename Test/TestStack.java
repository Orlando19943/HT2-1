import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Orlando
 * @author Brandon
 *
 */
class TestStack {
	iStack<Integer> stack = new Stack<Integer>();
	
	@Test
	public void TestPush () {
		stack.push(1);
		int esperado = 1; //Numero que se espera que retorne
		assertEquals(esperado, stack.peek());
	}
	
	@Test
	public void TestPop () {
		stack.push(1);
		stack.pop();
		boolean esperado = true; //Si es true, entonces el stack estara vacio
		assertEquals(esperado, stack.empty());
	}
	@Test	
	public void TestPeek () {
		stack.push(20);
		int esperado = 20; //Numero que se espera que retorne
		assertEquals(esperado, stack.peek());
	}
	
	@Test	
	public void TestEmpty () {
		stack.push(20);
		boolean esperado = false; //Si es false, entonces el stack no estara vacia
		assertEquals(esperado, stack.empty());
	}
	
	@Test	
	public void TestSize () {
		stack.push(20);
		stack.push(10);
		stack.push(5);
		int esperado = 3; //Tamanio que se espera que tenga el stack
		assertEquals(esperado, stack.size());
	}
	
	

	

}
