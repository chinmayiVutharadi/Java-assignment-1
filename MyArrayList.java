package collections;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList<E> extends ArrayList<E> {
		@Override
		public boolean add(E e) {
			if (e instanceof Integer || e instanceof Float || e instanceof Double) {
				super.add(e);
				return true;
			} else {
				throw new ClassCastException("Only Integer, Float, and Double are supported.");
			}
		}
	}

	