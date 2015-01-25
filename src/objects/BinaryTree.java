package objects;

public class BinaryTree {
	public Customer root;

	public void addKlant(Customer klant) {

		if (root == null) {
			root = klant;
		} else {

			Customer focusNode = root;

			Customer parent;

			while (true) {
				parent = focusNode;

				if(klant.getId() < focusNode.getId()){
					
					focusNode = focusNode.leftChildNode;
					
					if(focusNode == null){
						
						parent.leftChildNode = klant;
						return;
					}
				} else {
					focusNode = focusNode.rightChildNode;
					
					if(focusNode == null){
						
						parent.rightChildNode = klant;
						return;
					}
				}
				
			}
		}
	}
	
	public void inOrderTraversal(Customer focusNode){
		
		if(focusNode != null){
			inOrderTraversal(focusNode.leftChildNode);
			
			System.out.println(focusNode.getId());
			
			inOrderTraversal(focusNode.rightChildNode);
		}
	}
	
	public void preorderTraversal(Customer focusNode){
		
		if(focusNode != null){
			System.out.println(focusNode.getId());
			
			inOrderTraversal(focusNode.leftChildNode);
			inOrderTraversal(focusNode.rightChildNode);
		}
	}
	
	public void postOrderTraversal(Customer focusNode){
		
		if(focusNode != null){
			postOrderTraversal(focusNode.leftChildNode);
			postOrderTraversal(focusNode.rightChildNode);
			
			System.out.println(focusNode.getId());
						
		}
	}
	
	public Customer vindKlant(int id){
		Customer focusKlant = root;
		
		while(focusKlant.getId() != id){
			
			if(id < focusKlant.getId()){
				focusKlant = focusKlant.leftChildNode;
			} else {
				focusKlant = focusKlant.rightChildNode;
			}
			
			if(focusKlant == null){
				return null;
			}
		}
		
		return focusKlant;
	}
	
	public void verwijderKlant(int id){
		Customer focusKlant = root;
		Customer parentKlant = null;
		
		while(focusKlant.getId() != id){
			
			if(id < focusKlant.getId()){
				parentKlant = focusKlant;
				focusKlant = focusKlant.leftChildNode;
			} else {
				parentKlant = focusKlant;
				focusKlant = focusKlant.rightChildNode;
			}
			
		}
		
		if(focusKlant != null){
			if(id == parentKlant.leftChildNode.getId()){
				parentKlant.leftChildNode = focusKlant.leftChildNode;
			} else {
				parentKlant.rightChildNode = focusKlant.leftChildNode;
			}
		}
	}
	
}
