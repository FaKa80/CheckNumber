// Farzaneh Kazempour
/*
check whether a number is an Armstrong Number or not(Armstrong number is a number that is equal to the sum of
its own digits each raised to the power of the number of digits. For example 153 and 9474 are the Armstrong numbers)
and print all prime factors of a given number
*/
import java.util.Scanner;
public class CheckNumber {
    //function to check if the number is Armstrong or not
    static boolean isArmstrong(int n)
    {
        int temp, digits=0, sum=0;
        temp=n;
        //calculates number of digits
        while(temp>0)
        {
            temp = temp/10;
            digits++;
        }
        temp = n;
        while(temp>0)
        {
            int remainder = temp % 10;
            temp = temp/10;
            sum +=  (Math.pow(remainder, digits));
        }
        return n==sum;
    }

    //function to print all prime factors of a given number
    public static void primeFactors(int n)
    {
        System.out.print("prime factors of " + n + " : ");
        int c = 2;
        while (n > 1) {
            if (n % c == 0) {
                System.out.print(c + " ");
                n /= c;
            }
            else
                c++;
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();

        if(isArmstrong(number))
            System.out.println("Armstrong Number");

        else
            System.out.println("Not an Armstrong Number");

        primeFactors(number);
    }
}
