package mycollection;

import java.util.TreeSet;

public class myTreelist {

	public static void main(String[] args) {

		//prints in ascending order
		//duplication not allowed
		//array sort can be achieved using TreeList
		TreeSet<String>myTree = new TreeSet<String>();
		myTree.add("New");
		myTree.add("EEEEE");
		myTree.add("BBBB");
		myTree.add("FFFFF");
		myTree.add("AAAA");
		myTree.add("new");
		
		System.out.println("value of array =" + myTree.size());
		
		System.out.println("=================");
		for (String string : myTree) {
			System.out.println(string);
		}
		
	}
	
}
