import java.util.Scanner;
class Age{
public static void main(String[] args){
System.out.println("Enter a age:");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
if(a>=0 && a<=12)
System.out.println("child");
else if(a>=13 && a<=19)
System.out.println("teenager");
else if(a>=20 && a<=64)
System.out.println("adult");
else
System.out.println("senior");
}
}
