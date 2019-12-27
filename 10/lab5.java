package lab5;
import java.util.Scanner;
import java.util.logging.Logger; 
import java.util.logging.*;
import java.io.IOException;


public class lab5 {
	  public static void main(String[] args) throws IOException {
		  
		    Logger log = Logger.getLogger(lab5.class.getName());
		    try {
			Scanner input = new Scanner(System.in);
		    System.out.println("¬ведите количество свечей: ");
		   
		    int n = input.nextInt();
		    Candle Candles[] = new Candle[n];
		    
		    System.out.println("¬ведите высоты свечей:");
		    for (int i = 0; i < n; i++) {
		    	Candles[i] = new Candle(input.nextInt());
		    }
		    input.close();
		    
		    quantity quantity1 = new quantity();
		    quantity1.Candles(Candles);

		    	new Thread(quantity1).start();
		    } catch(Exception ex){
			
			 FileHandler handler = new FileHandler("logs.txt"); 
		     log.addHandler(handler); 
		     log.info("ќшибочка");

			}
	 }
}
