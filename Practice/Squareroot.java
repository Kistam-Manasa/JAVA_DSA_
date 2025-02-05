package DSA.Arrays;
import java.util.Scanner;
public class Squareroot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=mySqrt(n);
        System.out.println(c);;
    }
    
        public  static int mySqrt(int x) {
            return (int) Math.sqrt(x);
        }
    
}
