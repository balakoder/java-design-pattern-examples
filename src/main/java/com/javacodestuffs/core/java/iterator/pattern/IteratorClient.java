package com.javacodestuffs.core.java.iterator.pattern;

public class IteratorClient {
	public static void main(String[] args) {

		System.out.println("----------- Interator for Strings -----------");
		String[] names = { "Anna", "Bala", "Sara", "Joseph", "Shivani" };
		ArrayCollection<String> collection = new ArrayCollection<>(names);
		Iterator<String> iterator = collection.createIterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		Integer[] intList = { 101, 105, 50, 1001, 25 };

		System.out.println("-----------Interator for Integer-----------");
		ArrayCollection<Integer> intCollection = new ArrayCollection<>(intList);
		Iterator<Integer> intIterator = intCollection.createIterator();

		while (intIterator.hasNext()) {
			System.out.println(intIterator.next());
		}

	}
}
