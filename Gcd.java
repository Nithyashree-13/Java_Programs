class Gcd{
public static void main(String[] args){
int a=12,b=4;
while(b!=0){
int temp=b;
b=a%b;
a=temp;
}
System.out.println(a);
}
}