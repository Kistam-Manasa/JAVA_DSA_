package DSA;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Principal Amount:");
    int P=sc.nextInt();
    System.out.print("Enter Time Amount:");
    int T=sc.nextInt();
    System.out.print("Enter Rate of Interest Amount:");
    int R=sc.nextInt();
    int simpleInterest=(P*T*R)/100;
    System.out.println("Simple Interst: "+simpleInterest);
    sc.close();
    }
}
