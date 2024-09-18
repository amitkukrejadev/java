class DataSizeRange {

    public static void main(String[] args) {

        // Displaying range and size of primitive types
        System.out.println("Data Type Ranges and Sizes:");

        // Integer
        System.out.println("Int Minimum Value: " + Integer.MIN_VALUE);
        System.out.println("Int Maximum Value: " + Integer.MAX_VALUE);
        System.out.println("Int Size (in bytes): " + Integer.BYTES);

        // Byte
        System.out.println("Byte Minimum Value: " + Byte.MIN_VALUE);
        System.out.println("Byte Maximum Value: " + Byte.MAX_VALUE);
        System.out.println("Byte Size (in bytes): " + Byte.BYTES);

        // Short
        System.out.println("Short Minimum Value: " + Short.MIN_VALUE);
        System.out.println("Short Maximum Value: " + Short.MAX_VALUE);
        System.out.println("Short Size (in bytes): " + Short.BYTES);

        // Long
        System.out.println("Long Minimum Value: " + Long.MIN_VALUE);
        System.out.println("Long Maximum Value: " + Long.MAX_VALUE);
        System.out.println("Long Size (in bytes): " + Long.BYTES);

        // Float
        System.out.println("Float Minimum Value: " + Float.MIN_VALUE);
        System.out.println("Float Maximum Value: " + Float.MAX_VALUE);
        System.out.println("Float Size (in bytes): " + Float.BYTES);

        // Double
        System.out.println("Double Minimum Value: " + Double.MIN_VALUE);
        System.out.println("Double Maximum Value: " + Double.MAX_VALUE);
        System.out.println("Double Size (in bytes): " + Double.BYTES);

        // Using the data types and displaying values
        System.out.println("\nSample Values:");

        // Byte Takes 1 byte [-128 to 127]
        byte byteValue = 100;
        System.out.println("Byte: " + byteValue);

        // Short Takes 2 bytes [-32k to 32k]
        short shortValue = 31000;
        System.out.println("Short: " + shortValue);

        // Int Takes 4 bytes [-2 billion to 2 billion]
        int intValue = 31000;
        System.out.println("Integer: " + intValue);

        // Long Takes 8 bytes, must end with "L"
        long longValue = 12345678900L;
        System.out.println("Long: " + longValue);

        // Float Takes 4 bytes, must end with "F"
        float floatValue = 3.14F;
        System.out.println("Float: " + floatValue);

        // Double Takes 8 bytes, more precise
        double doubleValue = 3.141592653589793;
        System.out.println("Double: " + doubleValue);

        // Explanation of Primitive and Non-Primitive Data Types
        System.out.println("\nPrimitive and Non-Primitive Data Types:");

        // Primitive Data Types
        System.out.println("Primitive Data Types:");
        System.out.println("1. byte: Stores whole numbers from -128 to 127, takes 1 byte.");
        System.out.println("2. short: Stores whole numbers from -32,768 to 32,767, takes 2 bytes.");
        System.out.println("3. int: Stores whole numbers from -2 billion to 2 billion, takes 4 bytes.");
        System.out.println("4. long: Stores very large whole numbers, takes 8 bytes.");
        System.out.println("5. float: Stores fractional numbers up to 7 decimal digits, takes 4 bytes.");
        System.out.println("6. double: Stores fractional numbers with greater precision, takes 8 bytes.");
        System.out.println("7. char: Stores a single character, takes 2 bytes.");
        System.out.println("8. boolean: Stores true or false, takes 1 bit.");

        // Non-Primitive Data Types
        System.out.println("\nNon-Primitive Data Types:");
        System.out.println("1. String: Stores a sequence of characters, like \"Hello, World!\".");
        System.out.println("2. Arrays: A collection of elements of the same data type.");
        System.out.println("3. Classes: User-defined data types that hold objects.");
        System.out.println("4. Interfaces: Abstract data types that define a contract for classes.");
    }
}