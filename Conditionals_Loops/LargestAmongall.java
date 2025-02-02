
//Take integer inputs till the user enters 0 and print the largest number from all.
package DSA.Coditionals_loops;
import java.util.Scanner;
public class LargestAmongall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.println("enter inputs if you press zero then the system no more takes the input and displays the respective output");
        int max=Integer.MIN_VALUE;
        while(true){
            number=sc.nextInt();
            if(number==0){
                break;
            }
            if(max<number){
                max=number;
            }
            
        }
        System.out.println("Largest among all is"+max);
        sc.close();
    }
}
