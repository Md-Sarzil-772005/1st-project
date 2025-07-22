import java.util.Scanner;

public class Prime 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");  
        int n = input.nextInt();  
        if (n <= 1) 
        {
            System.out.println("Not a prime number");  
            return;
        }
        for (int i = 2; i <= n / 2; i++) 
        {
            if (n % i == 0) {
                System.out.println("Not a prime number");
                return;
            }
        }
        System.out.println("Prime number");
    }
}
