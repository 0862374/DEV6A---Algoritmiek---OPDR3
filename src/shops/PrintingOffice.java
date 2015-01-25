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
	}
	
	public void startPrinting(){
		
		System.out.println("Drukkerij is gestart met drukken");
		
		while(orders.peek() != null){
			Order bestelling = orders.poll();
			System.out.println("Bestelling verwerken");
			printerOne.newPrintOrder(bestelling);
			
			if(orders.peek() != null){
				orders.peek().setReadily(true);
			}
			
			while(!printerOne.updatePrintOrder()){}
			
			System.out.println("Bestelling is compleet");
		}
	}
	
}
