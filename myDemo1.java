impor java.util.*;
class myDemo1
{
public static void main(String arg[])
{
scanner obj=new scanner(System.in);
System.out.println("enter any number");
int num=obj.nextInt();
int i,fact=1;
for(i=1;i>=1;i--)
{
  fact=fact*i;
}
System.out.println("factorial is "+fact);
}
}