import opdracht2.Mergesort;
import opdracht2.LinearSearch;
import objects.BinaryTree;
import objects.Customer;
import objects.Order;
import shops.PrintingOffice;


public class Main {

	public static void main(String[] args) {
		PrintingOffice drukkerij = new PrintingOffice();
		Customer customer = new Customer(0, "Vos", "van der", "Jan", 19, true, "Rotterdam", "jvdv@o.nl");
		Order orderOne = new Order(0, customer);
		Order orderTwo = new Order(1, customer);
		
		drukkerij.newOrder(orderOne);
		drukkerij.newOrder(orderTwo);
		drukkerij.startPrinting();
		
		BinaryTree klantenTree = new BinaryTree();
		
		int a[] = {5,9,6,3,2};
		for(int i = 0; i < a.length; i++){
			klantenTree.addKlant(new Customer(a[i], "Vos" + i, "van der" + i, "Jan" + i, 19, true, "Rotterdam" + i, "jvdv@o.nl"));
		}
		
		klantenTree.preorderTraversal(klantenTree.root);
		
		//Voeding voor de MergeSort algorithm
		Mergesort mr2 = new Mergesort();
		int a1[] = {1,6,99,55,22,42,3,4};
		a1 = mr2.sort(a1);
		System.out.println(a1);
		
		LinearSearch sea = new LinearSearch();
		String[] namen = {"fred" , "barney", "tom", "jerry", "larry", "moe", "curly",
				"betty" , "wilma", "bart", "homer", "marge", "maggie", "lisa",
				"pebbles" , "bambam", "smithers", "burns", "milhouse", "george", "astro",
				"dino" , "mickey", "minnie", "pluto", "goofy", "donald", "huey",
				"louie" , "dewey", "snowwhite", "happy", "doc", "grumpy", "sneezy",
				"dopey" , "sleepy", "bambi", "belle", "gaston", "tarzan", "jane",
				"simba" , "scar", "mufasa", "ariel", "flounder", "bugs", "daffy",
				"elmer" , "foghorn", "chickenhawk", "roger", "jessica", "hank", "bobby",
				"peggy" , "spot", "pongo", "perdy", "buzz", "potatohead", "woody",
				"chuckie" , "tommy", "phil", "lil", "angelica", "dill", "spike",
				"pepe" , "speedy", "yosemite", "sam", "tweety", "sylvester", "granny",
				"spiderman" , "batman", "superman", "supergirl", "robin", "jimmy", "olsen",
				"thing" , "flash", "silversurfer", "xmen", "pokemon", "joker", "wonderwoman"
				};
		
	
		Customer[] a2 = {new Customer(0, "Vos", "van der", "Jan", 19, true, "Rotterdam", "jvdv@o.nl")};
		sea.getonSearching(a2);
		
		System.out.println(sea.getonSearching(a2));

		//sea.getonSorting(namen);
	}

}
