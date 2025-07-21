public class Gaza 
{
    public static void main(String[] args) 
    {
        int num1 = 16;
        int num2 = 4;
        double angle = 30;

        int sum = num1 + num2;
        int diff = num1 - num2;
        int prod = num1 * num2;
        float div = (float)num1 / num2;

        double power = Math.pow(num1, num2);
        double sqrt = Math.sqrt(num1);

        double radians = angle * 3.1416 / 180;

        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);

        System.out.println("Sum " + sum);
        System.out.println("Difference " + diff);
        System.out.println("Product " + prod);
        System.out.println("Division " + div);
        System.out.println("power" + power);
        System.out.println("sqrt" + sqrt);
        System.out.println("sin " + sin);
        System.out.println("cos " + cos);
        System.out.println("tan " + tan);

    }
}

