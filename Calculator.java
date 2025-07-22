import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number1 = input.nextInt();

        System.out.print("Enter another number: ");
        int number2 = input.nextInt();

        int addition, subtraction, multiplication;
        float division;
        double log1, log2, power, sqrt1, sqrt2, sin, cos, tan;

        addition = number1 + number2;
        subtraction = number1 - number2;
        multiplication = number1 * number2;
        division = (float) number1 / number2;

        log1 = Math.log(number1);
        log2 = Math.log(number2);
        power = Math.pow(number1, number2);
        sqrt1 = Math.sqrt(number1);
        sqrt2 = Math.sqrt(number2);

        sin = Math.sin(Math.toRadians(number1));
        cos = Math.cos(Math.toRadians(number1));
        tan = Math.tan(Math.toRadians(number1));

        System.out.println(" addition  " + addition);
        System.out.println(" subtraction  " + subtraction);
        System.out.println(" multiplication  " + multiplication);
        System.out.println(" division  " + division);

        System.out.println(" log of number1 " + log1);
        System.out.println(" log of number2 " + log2);
        System.out.println(" power " + power);
        System.out.println(" square root of number1 " + sqrt1);
        System.out.println(" square root of number2 " + sqrt2);
        System.out.println(" sin of number1 " + sin);
        System.out.println(" cos of number1 " + cos);
        System.out.println(" tan of number1 " + tan);

        Scanner.close();
    }
}


