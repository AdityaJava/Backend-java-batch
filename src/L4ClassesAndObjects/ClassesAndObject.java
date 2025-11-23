package L4ClassesAndObjects;

/**
 * Note1: Syntax for creating methods in Java
 *
 * <AccessModifier> <ReturnType> <MethodName> (int parameter1, long parameter2){
 * }
 */

/**
 * Note2: Constructor definition Rules'
 * 1: Constructor's name should be same as it's class
 * 2. Constructor shouldn't return anything
 */

/**
 * Note3:
 * 1. JVM gives default constructor if you have not defined any constructor;
 */

class Person {
    //variables
    int height;
    int weight;
    long x;
    String name;

    //Methods
    // This is method definition
    public void eat() {
        System.out.println("Person is Eating");
    }

    private void drink() {
        System.out.println("Drink");
    }

    public String praveen() {
        return "Hey Hello from person";
    }

    public int calculate(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public Person() {
    }

    public Person(int a) {
    }

    public Person(int a, int b) {
    }

}


public class ClassesAndObject {
    public static void main(String[] args) {
        // p is reference name
        Person p = new Person();

        //You are telling JVM to execute your method. This is known as method call
        p.eat();
        String s = p.praveen();
        System.out.println(s);
        int o = p.calculate(1, 2);
        System.out.println(o);
    }
}
