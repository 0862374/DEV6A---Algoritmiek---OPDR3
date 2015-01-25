package opdracht2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

import objects.Customer;

public class LinearSearch<T> {

	public LinearSearch() {

	}
	
	
	public Customer getonSearching(Customer[] customer) {

		/* Hier begint de linear search 
		 * De String Array wordt eerst opgehaald vanuit de main class.
		 * Daarna kan de gebruiker via console input zoeken of een persoon met een bepaalde
		 * achternaam bestaat. Als deze bestaat geeft het een object terug anders is gevondencust null
		 * 
		 * Order(n) code itereert door de length van de array. De values in de array worden 1 voor 1 
		 * opgezocht tot de value is gevonden
		 * */
		
		Customer gevondencust = null;
		Scanner sc = new Scanner(System.in);
		System.out.println(customer);
		System.out.println("Vul het woord in wat u wilt zoeken");
		String y = sc.next();

		int i;
		String search = y.toString();
		System.out.println(y);

		for (i = 0; i < customer.length; i++) {
			if (customer[i].getLastname().equals(search)
					|| String.valueOf(customer[i].getAge()).equals(search)) {
				gevondencust = customer[i];
			}
		}

		return gevondencust;
	}

}