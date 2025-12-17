import java.util.Scanner;
public class Main
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
if(t<15)
System.out.println("Cold");
else if(t<30)
System.out.println("Pleasant");
else if(t<40)
System.out.println("Hot");
else
System.out.println("HeatWave");
}
}