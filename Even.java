mport java.util.Scanner;
public class Even
{
    public static void main(String[] args)
    {
        int num;
          Scanner scanner=new Scanner(System.in);
          System.out.println("enter a num");
            num = scanner.nextInt();
            if(num%2==0)
              System.out.println("even number");
           else
          System.out.println("odd number");
      }
      
    }
    
