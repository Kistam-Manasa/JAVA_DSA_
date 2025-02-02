package DSA.Coditionals_loops;
import java.util.Scanner;
public class DIfferenceofProductandSumofgivenNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       
       System.out.println("enter a number");
       int  n=in.nextInt();
       Solution sc=new Solution();
       int result= sc.subtractProductAndSum(n);
       System.out.println("The difference of the product and sum of  "+n+ " is : "+result);;
in.close();
    }
}
class Solution {
    public int subtractProductAndSum(int n) {
        
        int a=n;
        int sum1=0,sum2=1,rem1 ,rem2;
        while(a>0){
    rem1=a%10;
    sum1=sum1+rem1;
    a=a/10;
        }
        a=n;
        while(a>0){
rem2=a%10;
sum2=sum2*rem2;
a=a/10;
        }
        return sum2-sum1;
    }}