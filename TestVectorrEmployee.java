package collections;

import java.util.Iterator;
import java.util.Vector;

public class TestVectorrEmployee {
	
		public static void main(String[] args) {
			Vector<VectorEmployee> list = new Vector<>();
			
			list.add(new VectorEmployee(101, "Ram", "123 street, India", 20000.0));
			list.add(new VectorEmployee(102, "Sita", "234 street, India", 30000.0));
			list.add(new VectorEmployee(103, "Lakshman", "345 street, India", 25000.0));
			list.add(new VectorEmployee(104, "Hanuman", "456 street, India", 40000.0));
			
			Iterator<VectorEmployee> it = list.iterator();
			while (it.hasNext()) 
				System.out.println(it.next());
			

		}

	
}
