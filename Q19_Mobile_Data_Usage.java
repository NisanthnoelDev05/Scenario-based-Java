import java.util.Scanner;
public class Main
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int d=sc.nextInt();
if(d<30)
System.out.println("LowData");
else if(d<=50)
System.out.println("HalfConsumed");
else
System.out.println("DataOver");
}
}