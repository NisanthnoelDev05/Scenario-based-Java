import java.util.Scanner;
public class Main
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int pin=sc.nextInt();
if(pin==1234)
System.out.println("AccessGranted");
else
System.out.println("AccessDenied");
}
}