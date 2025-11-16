package L4ClassesObjectsAndMemoryManagement;

import L3WhatAreClassesinJava.Person;

/**
 * 1. Heap Memory (RAM 3GB goes for HEAP memory of JVM) -> Memory out of bound for heap memory
 * 2. Stack Memory
 * 3. Code memory
 * 4. PC -> Program counter (Address of next instruction to be executed)
 */


class person {
    int height;
    int weight;

    //Methods are actions performed by the class
    public void eat() {
        System.out.println("I am eating");
    }
}

// MemoryOUtOfBound


public class Main {
    public static void main(String[] args) {
        // Here praveen is a reference to the object created by JVM
        Person praveen = new Person();
        System.out.println("asdjahkd");
    }
}

/**
 * How does JVM sees above
 * <p>
 * Person praveen =  {
 * int height;
 * int weight;
 * <p>
 * //Methods are actions performed by the class
 * public void eat() {
 * System.out.println("I am eating");
 * }
 * }
 */
