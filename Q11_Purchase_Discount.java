import java.util.Scanner;
public class Main
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
double p=sc.nextDouble();
if(p>=3000)
System.out.println(p*0.85);
else if(p>=1000)
System.out.println(p*0.9);
else
System.out.println(p);
}
}