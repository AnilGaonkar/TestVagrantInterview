package legacyClasses;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable Ht = new Hashtable();
		Ht.put("A", "Ant");
		Ht.put("C", "Cat");
		Ht.put("B", "Bat");
		Ht.put("E", "Elephant");
		Ht.put("D", "Dog");
		Ht.put("A", "Apple");
		Ht.put("F", "Apple");
		System.out.println(Ht);
		
		Enumeration<String> E1=Ht.elements();
		while(E1.hasMoreElements())
		{
			System.out.println(E1.nextElement());
		}
		
		Enumeration<String> E2=Ht.keys();
		while(E2.hasMoreElements())
		{
			System.out.println(E2.nextElement());
			
		}
	}

}
