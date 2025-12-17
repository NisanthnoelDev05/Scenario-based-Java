import java.util.Scanner;
public class Main
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
String d=sc.next();
if(d.equals("Saturday")||d.equals("Sunday"))
System.out.println(150);
else
System.out.println(100);
}
}