package com.javacodestuffs.core.java.iterator.pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Bala");
		names.add("Anna");
		names.add("Charlie");
		names.add("Joseph");
		names.add("Sara");
		names.add("Shivani");

		ListIterator<String> iterator = names.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
