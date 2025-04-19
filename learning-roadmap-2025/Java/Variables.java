package Java;

public class Variables {

    public static void main(String[] args) {

//==============================================

    // boolean
    boolean a = true;
    System.out.println("Value of a is: " + a);

//==============================================

    boolean b = false;
    System.out.println("Value of b is: " + b);

//==============================================
    { 
        a = true; 
        System.out.println("This enclosed a is: " + a);
    }
//==============================================
    { 
        b = false;
        System.out.println("This enclosed b is: " + b); 
    } 
//==============================================

    // bytes can only hold -128 to 127 integer number
    byte byteA = -128;
    System.out.println("MyByte: " + byteA);

//==============================================

    byte byteB = 127;
    System.out.println("MyByte: " + byteB);

//==============================================

    byte sum = (byte) (byteA + byteB); // you cannot do direct arithmetic so use byte or  (byte)
    System.out.println("Sum is: " + sum);

//==============================================

    // short is used for shorter numbers
    short temperature = -32768;
    System.out.println("Temperature is: " + temperature);

//==============================================

    // int can hold -2 billion to 2 billion
    int num1 = 90;
    System.out.println("Value of num1 is: " + num1);

//==============================================

    // long is used for longer or larger numbers
    long salary = 100200300;
    System.out.println("Your Salary is: " + salary);

//==============================================
    
    float pi = 3.14f; //float follows any decimal value with an f (fixed digits)
    System.out.println("Basic PI is: " + pi);

//==============================================

    double unlimitedDecimal = 3.141592; //does not follow decimal value with an f
    System.out.println("Double is Unlimited: " +unlimitedDecimal);

//==============================================

    char gyro = 'g'; //only takes single quotations and single characters or ASCII value
    System.out.println("Gyro as char is: " + gyro);

//==============================================
    
    String name = "Gyro Vinz Sagal"; //takes double quotations and is user-defined
    System.out.println("My Name is: " + name);

//==============================================

    }
}
