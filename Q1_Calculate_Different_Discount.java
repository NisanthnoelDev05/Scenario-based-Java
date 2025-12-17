import java.util.Scanner;
public class Main
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
double b=sc.nextDouble();
if(b>=5000)
System.out.println(b*0.8);
else if(b>=2000)
System.out.println(b*0.9);
else
System.out.println(b);
}
}