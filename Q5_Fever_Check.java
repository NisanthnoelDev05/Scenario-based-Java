import java.util.Scanner;
public class Main
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
double t=sc.nextDouble();
if(t>100)
System.out.println("Fever");
else
System.out.println("Normal");
}
}