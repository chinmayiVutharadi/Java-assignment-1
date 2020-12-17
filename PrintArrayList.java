package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrintArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("World");
		list.add("printed");
		list.add("from arraylist");
		
		printAll(list);
	}

	public static void printAll(List<String> list) {
		Iterator<String> it = list.iterator();
		
		while (it.hasNext())
			System.out.println(it.next());
	}
}
