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
		// order komt binnen
	}
	
	private void deletePrintOrder() {
		
		//Als de printer klaar is wordt de order status op null gezet
		order = null;
		System.out.println("Bestelling is verwijderd..");
	}
	
	public boolean updatePrintOrder(){
		// Geeft status(de tijd en of deze klaar of niet is)
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
