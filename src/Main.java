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
		//drukkerij.startDrukkerij();
		
		BinaryTree klantenTree = new BinaryTree();
		
		int a[] = {5,9,6,3,2};
		for(int i = 0; i < a.length; i++){
			klantenTree.addKlant(new Customer(a[i], "Vos" + i, "van der" + i, "Jan" + i, 19, true, "Rotterdam" + i, "jvdv@o.nl"));
		}
		
		//klantenTree.inOrderTraversal(klantenTree.root);
		//klantenTree.postOrderTraversal(klantenTree.root);
		klantenTree.preorderTraversal(klantenTree.root);
		//System.out.println(klantenTree.vindKlant(13).getAchternaam());
		
	}

}
