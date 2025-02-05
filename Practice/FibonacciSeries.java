package DSA;
import java.util.Scanner;
public class FibonacciSeries {
 public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter a number to which you want to print all the fibonacci numbers till that number count");
    int a=sc.nextInt();
    int b=0,c=1,sum=0;
    System.out.println("The "+a+" Fibonacci series are listed below :");
    System.out.print("0 1 ");
    for(int i =2;i<a;i++){
       sum=b+c;
       b=c;
       c=sum;
       System.out.print(sum+ " ");
    }
    sc.close();
 }   
}
