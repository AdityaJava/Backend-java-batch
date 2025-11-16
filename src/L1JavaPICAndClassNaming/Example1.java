/**
 * Note1 : PIC structure
 * <p>
 * P -> Package
 * I -> Imports
 * C -> Class
 * PIC
 */

/**
 * Note2: Class naming
 * One Java file should only have one public class with same name as Java file but it can have many non public classes
 * Why: JVM searches the public class inside your file with the name of the file and calls it's Main method
 * JVM calls like: Example1.main("Str")
 */
package L1JavaPICAndClassNaming;

import java.util.HashMap;
import java.util.Map;

public class Example1 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>(
        );

        System.out.println("Hello world");
    }
}