package objects;

import java.util.Date;
import java.util.Random;

public class Printer {
	Order order = null;

	public void newPrintOrder(Order order) {
		this.order = order;
		order.setDuration(new Random().nextInt(5000));
		order.setStartTime(new Date());
		order.setProcessing(true);
		
	}
	
	private void deletePrintOrder() {
		order = null;
		System.out.println("Bestelling is verwijderd..");
	}
	
	public boolean updatePrintOrder(){
		
		if((order.getStartTime().getTime() + order.getDuration()) < new Date().getTime()){
			order.setComplete(true);
			deletePrintOrder();
		}
		
		return isIdle();
		
	}
	
	public boolean isIdle(){
		return (order == null);
	}

}
