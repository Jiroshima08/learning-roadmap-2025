package Java;

public class VariableFamiliarizationPart2 {
    
    public static void main(String[] args) {
        
        //boolean
        boolean answer1 = true;
        boolean answer2 = false;
        System.out.println("Your Answer in A is: " + answer1 + ".\n");
        System.out.println("Your Answer in B is: " + answer2 + ".\n");
        System.out.println("Your Answers in A and B are: " + answer1 + " " + answer2 + " respectively.\n");
        
        //boolean as a code block { }
        {
            boolean gyro = true;
            System.out.println("Gyro is always: " + gyro + ".\n");
        }
        {
            boolean dianne = false;
            System.out.println("Dianne is always: " + dianne + ".\n");
        }

        //short
        short height = 4; // in meters
        short weight = 55; // in kg 
        int bmi = weight / height * 2;
        System.out.println("Your Height is: " + height + ".\n");
        System.out.println("Your Weight is: " + height + weight + ".\n");
        System.out.println("Your BMI is: " + bmi + ".\n");

        //long
        long assets = 900500;
        long depreciation = 400100;
        long remaining = assets - depreciation;
        System.out.println("Your Asset Costs: " + assets + ".\n");
        System.out.println("Your Depreciation Costs: " + depreciation + ".\n");
        System.out.println("The Remaining Money is: " + remaining + ".\n");

        //byte
        byte byte1 = -128;
        byte byte2 = 127;
        byte product = (byte) (byte1 * byte2);
        System.out.println("The Sum of byte1 and byte2 is: " + product + ".\n");
        System.out.println("The Value of byte1 is: " + byte1 + " and byte2 is: " + byte2 + ".\n");

        //int
        int math = 90;
        int science = 95;
        int english = 96;
        int average = math + science + english / 3;
        System.out.println("Your Grade Average is: " + average + ".\n");
        System.out.println("Your Grade in Math is: " + math + ".\n");
        System.out.println("Your Grade in Science is: " + science + ".\n");
        System.out.println("Your Grade in English is: " + english + ".\n");

        //float
        float projectile1 = 1.59f;
        float projectile2 = 1.025f;
        float difference = projectile1 - projectile2;
        System.out.println("The Total Damage Dealt is: " + difference + ".\n");

        //double
        double hitRate = 80.90;
        double critRate = 13.87;
        double quotient = hitRate / critRate;
        System.out.println("Your Absolute Hit is: " + quotient + ".\n");

        //char
        char visaya = 'v';
        char sagal = 's';
        System.out.println("Dianne's Surname Initial is: " + visaya + ".\n");
        System.out.println("Gyro's Surname Initial is: " + sagal + ".\n");

        //string
        String text1 = "Hello Dianne!";
        String text2 = "You look beautiful today! ;)";
        System.out.println("Gyro sent Dianne a message that says... \n " + text1 + " " + text2 + ".\n");

        // END OF VARIABLE FAMILIARIZATION PART 2

    }
}
