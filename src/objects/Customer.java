package objects;

import java.util.List;

public class Customer {
	private int id;
	private String lastname;
	private String insertion;
	private String firstname;
	private int age;
	private boolean IsMan;
	private String place;
	private String email;
	
	public Customer leftChildNode;
	public Customer rightChildNode;
	
	public Customer(int id, String lastname, String insertion, String firstname, int age, boolean IsMan, String place, String email){
	
		// Elke veld is gedefineerd 
		this.id = id;
		this.lastname = lastname;
		this.insertion = insertion;
		this.firstname = firstname;
		this.age = age;
		this.IsMan = IsMan;
		this.place = place;
		this.email = email;
	}
	
	// get and setters 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getInsertion() {
		return insertion;
	}

	public void setInsertion(String insertion) {
		this.insertion = insertion;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isIsMan() {
		return IsMan;
	}

	public void setIsMan(boolean isMan) {
		IsMan = isMan;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public List<Customer> insertionSortOnLastname(List<Customer> customerList){
		final int listSize = customerList.size();
		Customer[] y = customerList.toArray(new Customer[0]);
		String tempLastname;
		
		for(int i = 1; i < listSize; i++){
			tempLastname = customerList.get(i).getLastname();
			
			while((i -1 >= 0) && (tempLastname.compareTo(customerList.get(i - 1).getLastname()) < 1)){
				y[i] = y[i - 1];
				i--;
			}
		}
		
		return customerList;
	}
		
}
