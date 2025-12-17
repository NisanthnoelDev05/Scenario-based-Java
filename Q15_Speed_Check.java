import java.util.Scanner;
public class Main
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
if(s>100)
System.out.println("OverSpeed");
else
System.out.println("WithinLimit");
}
}