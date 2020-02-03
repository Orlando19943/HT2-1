/**
 * @author Orlando
 * @author Brandon Hernández 19376
 * @version 30/01/2020
 * @since 30/01/2020
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		  File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	      String linea = null;
	      String contenido = null;
	      Calculadora cal = new Calculadora();
	      iStack<Integer> stack = new Stack<Integer>();
	      String suma = "+";
	      String resta = "-";
	      String mul = "*";
	      String div = "/";
	      int n = 1;
    	  int num1 = 0;
    	  int num2 = 0;
	      
	      try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         archivo = new File ("datos.txt"); //Hay que crear el archivo para que sirva
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);

	         // Lectura del fichero
	         while((linea=br.readLine())!=null)
	        	contenido = linea.replace(" ", "");
	            


	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
	      System.out.println("Datos que contiene el documento: "+contenido);
	      
	      //Ciclo para llenar el stack con los datos del documento y operar
	      for (int i=0;i<contenido.length();i++) {
	    	  num1 = 0;
	    	  num2 = 0;
	    	  
	    	  stack.push(Integer.parseInt(contenido.substring(i, i+1)));
	    	  if (stack.peek().equals(suma)) {
	    		  stack.pop();
	    		  num2= stack.peek();
	    		  stack.pop();
	    		  num1=stack.peek();
	    		  stack.pop();
	    		  stack.push(cal.suma(num1, num2));
	    		  System.out.println("Resultado de la "+ n + " operacion= "+stack.peek());
	    		  n++;
	    	  }
	    	  if (stack.peek().equals(resta)){
	    		  stack.pop();
	    		  num2=stack.peek();
	    		  stack.pop();
	    		  num1=stack.peek();
	    		  stack.pop();
	    		  stack.push(cal.resta(num1, num2));
	    		  System.out.println("Resultado de la "+ n + " operacion= "+stack.peek());
	    		  n++;
	    	  }
	    	  if (stack.peek().equals(mul)){
	    		  stack.pop();
	    		  num2=stack.peek();
	    		  stack.pop();
	    		  num1=stack.peek();
	    		  stack.pop();
	    		  stack.push(cal.multiplicacion(num1, num2));
	    		  System.out.println("Resultado de la "+ n + " operacion= "+stack.peek());
	    		  n++;
	    	  }
	    	  if (stack.peek().equals(div)){
	    		  stack.pop();
	    		  num2=stack.peek();
	    		  stack.pop();
	    		  num1=stack.peek();
	    		  stack.pop();
	    		  stack.push(cal.division(num1, num2));
	    		  System.out.println("Resultado de la "+ n + " operacion= "+stack.peek());
	    		  n++;
	    	  }
	      }
	      
	      

         
		

		

	}

}
