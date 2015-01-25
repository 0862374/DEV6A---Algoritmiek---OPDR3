package objects;

import java.util.Date;

public class Order {
	private int id;
	private Customer customer;
	private Date startTime;
	private long duration;
	private boolean isProcessing;
	private boolean isComplete;
	private boolean isReadily;
	
	public Order(int id, Customer customer){
		this.id = id;
		this.customer = customer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public boolean isProcessing() {
		return isProcessing;
	}

	public void setProcessing(boolean isProcessing) {
		this.isProcessing = isProcessing;
	}

	public boolean isComplete() {
		return isComplete;
	}

	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}

	public boolean isReadily() {
		return isReadily;
	}

	public void setReadily(boolean isReadily) {
		this.isReadily = isReadily;
	}
	
}
