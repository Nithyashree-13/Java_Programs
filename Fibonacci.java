import java.util.Scanner;
class Fibonacci{
public static void main(String[] args){
int a=0,b=1,c;
System.out.println("enter a number:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println(a);
System.out.println(b);
for(int i=0;i<=n;i++)
{
c=a+b;
a=b;
b=c;
System.out.println(c);
}
}
}
