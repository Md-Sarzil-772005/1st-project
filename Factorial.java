public class SimpleFactorial 
{
    public static void main(String[] args) 
  {
        int factorial = 1;
        
        for(int num = 1; num <= 5; num++) 
        {
            factorial = factorial * num;
            System.out.println(factorial);
        }
    }
}  
