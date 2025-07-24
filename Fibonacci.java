import java.util.Scanner;

public class Fibonacci 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Numbers" );
        int n = in.nextInt();
        
        int a = 0, b = 1;
        
        for(int i = 0; i < n; i++) 
        {
            System.out.print(a + " ");
            b = a + (a = b);
        }
    }
}
