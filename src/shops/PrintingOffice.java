package shops;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

import objects.Customer;
import objects.Order;
import objects.Printer;

public class PrintingOffice {
	Queue<Order> orders = new LinkedList<Order>();
	Printer printerOne = new Printer();
	Printer drukkerTwee = new Printer();
	List<Customer> klanten = new ArrayList<Customer>();
	
	public PrintingOffice(){
		
	}
	
	public void newOrder(Order bestelling){
		orders.add(bestelling);
		// bestelling wordt toegevoerd aan printer in een list
	}
	
	public void startPrinting(){
		/*
		 * nadat de bestelling ontvangen is begint het algorithme
		 * m.b.v ordders.add
		 * 
		 * */
		System.out.println("Drukkerij is gestart met drukken");
		
		//kijkt of de eerste in de rij gevuld is
		
		while(orders.peek() != null){
			
			// Vraagt de eerste op de stapel op en verwijderd deze van de stapel
			Order bestelling = orders.poll();
			
			System.out.println("Bestelling verwerken");
			
			/* De bestelling wordt voorgeleid aan een printer en roept daarmee de functie aan newPrintOrder
			 * De timer hiervan begint dan ook te lopen.
			 * In proces wordt op ja gezet in het printer object
			*/
			printerOne.newPrintOrder(bestelling);
			
			//Hier kijkt het systeem of de orders List leeg is
			
			if(orders.peek() != null){
				orders.peek().setReadily(true);
			}
			// als de printer geen order meer heeft wordt de print gestopt. Het proces is daarmee klaar.
			// De stoptijd en totale verwerkingstijd wordt afgegeven
			while(!printerOne.updatePrintOrder()){}
			
			System.out.println("Bestelling is compleet");
		}
	}
	
}
