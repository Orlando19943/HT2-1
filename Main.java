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
	      String suma = "+";
	      String resta = "-";
	      String mul = "*";
	      String div = "/";
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
	      System.out.println(contenido);
	      
	      //Ciclo para llenar el stack con los datos del documento
	      for (int i=0;i<contenido.length();i++) {
	    	  num1 = 0;
	    	  num2 = 0;
	    	  cal.push(contenido.substring(i, i+1));
	    	  if (cal.peek().equals(suma)) {
	    		  cal.pop();
	    		  num2=Integer.parseInt((String) cal.peek());
	    		  cal.pop();
	    		  num1=Integer.parseInt((String) cal.peek());
	    		  cal.pop();
	    		  cal.push(String.valueOf(cal.suma(num1, num2)));
	    		  System.out.println(cal.peek());
	    	  }
	    	  if (cal.peek().equals(resta)){
	    		  //System.out.println(cal.peek() + "ad");
	    		  cal.pop();
	    		 // System.out.println(cal.peek() + "asd");
	    		  num2=Integer.parseInt((String) cal.peek());
	    		  cal.pop();
	    		  //System.out.println(cal.peek() + "asd");
	    		  num1=Integer.parseInt((String) cal.peek());
	    		  cal.pop();
	    		  cal.push(String.valueOf(cal.resta(num2, num1)));
	    		  System.out.println(cal.peek());
	    	  }
	    	  if (cal.peek().equals(mul)){
	    		  cal.pop();
	    		  num2=Integer.parseInt((String) cal.peek());
	    		  cal.pop();
	    		  num1=Integer.parseInt((String) cal.peek());
	    		  cal.pop();
	    		  cal.push(String.valueOf(cal.multiplicacion(num1, num2)));
	    		  System.out.println(cal.peek());
	    	  }
	    	  if (cal.peek().equals(div)){
	    		  cal.pop();
	    		  num2=Integer.parseInt((String) cal.peek());
	    		  cal.pop();
	    		  num1=Integer.parseInt((String) cal.peek());
	    		  cal.pop();
	    		  cal.push(String.valueOf(cal.division(num2, num1)));
	    		  System.out.println(cal.peek());
	    	  }
	      }
	      
	      

         
		

		

	}

}
