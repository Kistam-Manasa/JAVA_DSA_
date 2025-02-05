package DSA;
import java.util.Scanner;
public class OddorEven {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();
        if(n<0){
            System.out.println("Enter a positive number");
           
        }
        if(n%2==0){
            System.out.println(n+" : is a even number ");
        }
        if(n%2==1){
            System.out.println(n+" : is a odd number");
        } 
        in.close();
    }
}
