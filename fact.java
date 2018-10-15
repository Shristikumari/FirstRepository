package fact;
import java.util.Scanner;
public class Fact
{
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int num = scanner.nextInt();
        int i,fact=1;
        for(i=num;i>=1;i--)
    {
      fact=fact*i;
      System.out.println(fact);
    }
    }
    
}
