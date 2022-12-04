package legacyClasses;

import java.util.Enumeration;

public class Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Vector<String> V = new java.util.Vector<String>();
		V.add("C");
		V.add("D");
		V.add("A");
		V.add("E");
		V.add("B");
		V.add
		System.out.println(V); 
		
		Enumeration<String> E = V.elements();
		while(E.hasMoreElements())
		{
			System.out.println(E.nextElement());
		}
		System.out.println(V.firstElement());
		
		System.out.println(V.subList(0, 3));
		
	}

}
