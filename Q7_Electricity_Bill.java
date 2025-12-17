import java.util.Scanner;
public class Main
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int u=sc.nextInt();
int bill=0;
if(u<=100)
bill=0;
else if(u<=300)
bill=(u-100)*5;
else
bill=1000+(u-300)*10;
if(u>500)
bill+=500;
System.out.println(bill);
}
}