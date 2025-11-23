package L6ClassVariablesAndMethodVariables;

class Person {

    //Class Variables
    int height;
    int weight;
    String name;

    public void eat() {
        //Method Variable
        int eatKg = 1;

        System.out.println("Height  " + height);
        System.out.println(weight);
        System.out.println(name);
    }

    public void drink() {
        this.height = 10;
        System.out.println("Height  " + height);
        System.out.println(weight);
        System.out.println(name);
    }

    // This is a Parameterized constructor
    public Person(int height, int weight, String name) {
        this.height = height;
        this.weight = weight;
        this.name = name;
    }

}


public class ClassVariablesAndMethodVariables {
    public static void main(String[] args) {
        Person p = new Person(5, 60, "Praveen");
        p.eat();

        System.out.println("------------------------------------------");
        Person p1 = new Person(15, 100, "ABC");
        p1.eat();
    }
}
