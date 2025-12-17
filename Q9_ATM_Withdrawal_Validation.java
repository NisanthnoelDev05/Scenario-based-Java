import java.util.Scanner;
public class Main
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int bal=sc.nextInt();
int amt=sc.nextInt();
if(amt<=bal&&amt%100==0)
System.out.println("WithdrawalAllowed");
else
System.out.println("InvalidTransaction");
}
}