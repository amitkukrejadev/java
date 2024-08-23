public class DataTypes {
    public static void main(String[] args){
        // Data Types With Size Information
        // int: 4 bytes (32 bits)
        int a = 10; 
        // float: 4 bytes (32 bits)
        float b = 3.14F;
        // double: 8 bytes (64 bits)
        double c = 3.1415926535;
        // char: 2 bytes (16 bits, UTF-16)
        char d = 'a';
        // boolean: 1 byte (8 bits, but size may vary, JVM specific)
        boolean e = true;
        // String: 24 bytes (object overhead) + 2 bytes per character (UTF-16) + additional memory for internal object references and length (this is a simplification)
        // In this case, "Hello World" has 11 characters, so 24 bytes (object overhead) + 2 * 11 = 22 bytes + additional overhead for the object.
        // Note: Actual memory usage of a String object can be more complex due to internal optimizations.
        String f = "Hello World";
        
        // Output the values of the variables
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        
        // Output the type of variable 'a'
        System.out.println("The type of a is " + ((Object) a).getClass().getSimpleName());
    }
}
