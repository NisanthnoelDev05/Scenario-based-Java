import java.util.Scanner;
public class Main
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
if(a<12)
System.out.println(50);
else if(a<60)
System.out.println(100);
else
System.out.println(70);
}
}