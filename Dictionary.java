package legacyClasses;

import java.util.Enumeration;
import java.util.Hashtable;

public class Dictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Dictionary<String, String> D = new Hashtable<String,String>();
		D.put("A", "Apple");
		D.put("C", "Cat");
		D.put("E", "Elephant");
		D.put("B", "Bat");
		D.put("D", "Dog");
		D.put("A", "Aeroplane");
		D.put("B", "Ant");
		D.put("B", "Ant");
		D.put("F", "Ant");
		System.out.println(D);
		
		Enumeration<String> E1 = D.elements();
		while(E1.hasMoreElements())
		{
			System.out.println(E1.nextElement());
		}
		
		Enumeration<String> E2 = D.keys();
		while(E2.hasMoreElements())
		{
			System.out.println(E2.nextElement());
		}
	}

}
