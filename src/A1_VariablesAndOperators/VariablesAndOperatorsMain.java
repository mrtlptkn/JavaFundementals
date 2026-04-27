package A1_VariablesAndOperators;

public class VariablesAndOperatorsMain {

    public static void main(String[] args) {

        variables();
        operators();

    }

    public  static  void  variables() {
        //TODO Create a variable of type boolean and assign it the value true
        // byte: 8 bit, range: -128 to 127
        boolean myBoolean = true;

        //TODO Create a variable of type byte and assign it the value 127
        byte myByte= 127; //TODO Create a variable of type byte and assign it the value 100

        // short: 16 bit (2 byte), range: -32,768 to 32,767
        short myShort = 100;

        //TODO Create a variable of type int and assign it the value 10
        // int: 32 bit (4 byte), range: -2,147,483,648 to 2,147,483,647
        int myInt = 10;

        // long: 64 bit (8 byte), range: -9,223,372,036,854,775,808 to 9
        long myLong = 100000L;


        //TODO Create a variable of type float and assign it the value 0.5
        // float:  32 bit (4 byte), IEEE 754 single-precision, range: ~1.4e-45 to ~3.4e+38
        float myFloat = 0.5f;

        //TODO Create a variable of type double and assign it the value 3.14
        // what is the size ?
        // double: 64 bit (8 byte), IEEE 754 double-precision, range: ~4.9e-324 to ~1.8e+308
        double myDouble = 3.14;


        //TODO Create a variable of type String and assign it the value "Hello, World!"
        String myString = "Hello, World!";
    }

    public  static  void  operators(){

        // ++ code sample ?
            int a = 5;
            a++;
            System.out.println("After post-increment: " + a); // Output: 6

            int b = 5;
            ++b; // b is now 6
            System.out.println("After pre-increment: " + b); // Output: 6

            int c = 5;
            System.out.println("Post-increment value: " + c++); // Output: 5 (then c becomes 6)
            System.out.println("Current value of c: " + c); // Output: 6

            int d = 5;
            d+=5;
            System.out.println("Pre-increment value: " + d); // d becomes 6, then Output: 6

    }

}
