package com.javacodestuffs.core.java.iterator.pattern;

public class ArrayCollection<T> implements Aggregate<T> {
    private final T[] array;

    public ArrayCollection(T[] array) {
        this.array = array;
    }

    @Override
    public Iterator<T> createIterator() {
        return new ArrayIterator<>(array);
    }
}

 
