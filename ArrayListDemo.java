package legacyClasses;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> L1 = null;
		List<String> L2 = null;
		try
		{
			L1 = new ArrayList<String>();
			L1.add("Apple");
			L1.add("Banana");
			L1.add("Orange");
			L1.add("Tomato");
			L1.add(0,"Mango");
			System.out.println(L1);
			
			
			L2 = new ArrayList<String>();
			L2.add("Red");
			L2.add("Yellow");
			L2.add("Orange");
			L2.add("Red");
			L2.add("Green");
			System.out.println(L2);
			
			
		
			/*if(L1.addAll(L2)==true)
			{
				System.out.println("Added List2 to List1");
			}
			else
			{
				System.out.println("Addition failed");
			}
			System.out.println(L1);*/
			
			if(L1.addAll(0,L2)==true)
			{
				System.out.println("Added List2 to List1");
			}
			else
			{
				System.out.println("Addition failed");
			}
			System.out.println(L1);
			
			/*
			if(L2.addAll(L1)==true)
			{
				System.out.println("Added List1 to List2");
			}
			else
			{
				System.out.println("Addition failed");
			}
			System.out.println(L2);*/
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			L1 = null;
			L2 = null;
		}
	}

}
