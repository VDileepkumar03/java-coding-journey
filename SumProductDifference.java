import java.util.Scanner;
class SumProductDifference
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a value:");
double a=sc.nextDouble();
System.out.println("enter b value:");
double b=sc.nextDouble();
System.out.println("enter c value:");
double c=sc.nextDouble();
double sum=a+b+c;
System.out.println("sum of abc:"+sum);
double product=a*b*c;
System.out.println("product of abc:"+product);
double pms=product-sum;
System.out.println("Product minus sum is:"+pms);






}
}