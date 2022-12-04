package legacyClasses;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> Qlist = new LinkedList<String>();
		Qlist.add("D");
		Qlist.add("A");
		Qlist.add("C");
		Qlist.add("B");
		Qlist.add("A");
		
		System.out.println(Qlist);
		Qlist.removeIf(n -> (n.charAt(0)=='A'));
		String s = Qlist.peek();
		System.out.println(s);
		
		Qlist.poll();
		System.out.println(Qlist);
		
		Qlist.remove();
		System.out.println(Qlist);
	}

}
