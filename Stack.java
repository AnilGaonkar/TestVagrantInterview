package legacyClasses;

import java.util.ListIterator;

public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Stack<Integer> St = null;
		try
		{
			St = new java.util.Stack<Integer>();
			St.add(100);
			St.add(400);
			St.add(600);
			St.add(200);
			St.add(600);
			St.add(300);
			St.add(500);
			St.add(300);
			System.out.println(St);
			
			St.pop();//will remove last value
			System.out.println(St);
			St.removeIf(n -> (n==300));
			St.pop();
			System.out.println(St);
			
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
}
