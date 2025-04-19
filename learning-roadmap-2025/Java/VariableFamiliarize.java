package Java;

public class VariableFamiliarize {

    public static void main(String[] args) {
        
        /*
        VARIABLES IN JAVA
        1. boolean
        2. byte
        3. short
        4. long
        5. int
        6. float
        7. double
        8. char
        9. String
        */

        // VARIABLE FAMILIARIZATION REPEATED CODE

        boolean a = true;
        boolean b = false;
        System.out.println("Your Answer in 1 is: " + a + ".\n");
        // Your Answer in 1 is: true.
        System.out.println("Your Answer in 2 is: " + b + ".\n");
        // Your Answer in 1 is: false.


        { // Boolean gyro and dianne identifies as a code block with the { }
            boolean gyro = true; 
            System.out.println("Gyro's Answer is: " + gyro + "\n");
        }
        {
            boolean dianne = false;
            System.out.println("Dianne's Answer is: " + dianne + "\n");
        }

        // Use byte since you cannot directly do arithmetic with byte
        byte byteA = -128;
        byte byteB = 127;
        byte sum =  (byte) (byteA + byteB);
        System.out.println("The SUM of " + byteA + " and " + byteB + " is: " + sum + ".\n");
        System.out.println("The Values of byteA and byteB are " + byteA + " and " + byteB + " respectively. \n");
        
        // Use long for larger numbers (millions, etc)
        long salary = 100456;
        System.out.println("Your Salary is: " + salary + ".\n");

        // Use short for shorter numbers (measurements, etc)
        short temperature = -900;
        short celsius  = 482;
        System.out.println("The Temperature Outside is: " + temperature + " or " + celsius + " degrees in Celsius. \n");

        // Use int for extremely large number size -2 billion to 2 billion
        int num1 = 900123800;
        int num2 = 400654900;
        int difference = 0;
        System.out.println("The Values of num1 and num2 are " + num1 + " and " + num2 + " respectively. \n" );
        System.out.println("The Difference of " + num1 + " and " + num2 + " is: " + difference + ".\n");

        // Use float for numbers with f
        float pi = 3.14f;
        float radius = 10;
        float circumference = 2 * radius * pi;
        System.out.println("The Circumference of a Circle is: " + circumference);
        System.out.println("The Value of PI is: " + pi + ". Radius is equal to " + radius + ".\n");

        // Use double for numbers without an f
        double decimalA = 1.25;
        double decimalB = 1.50;
        double quotient = 0;
        System.out.println("The Value of decimalA is " + decimalA + " and decimalB is " + decimalB + ".\n");
        System.out.println("The Quotient of " + decimalA + " and " + decimalB +  " is: " + quotient + ".\n");

        /* 
        Use char for single character or letter values [ASCII]
        char uses single quotations (' ')
        */
        char gyro = 'g';
        char dianne =  'd';
        System.out.println("Gyro's Initial is: " + gyro + ".\n");
        System.out.println("Dianne's Initial is: " + dianne  + ".\n");

        /*
        Use String for user-defined variables (sentences, etc)
        String uses double quotations (" ")
        */
        String message1 = "Gyro and Dianne";
        String message2 = "are both happy together";
        System.out.println(message1 + message2 + ".\n");
        System.out.println("The Secret Message is: " + message1 + " " + message2 + ".\n");

        // END OF VARIABLE FAMILIARIZATION
    }
}
