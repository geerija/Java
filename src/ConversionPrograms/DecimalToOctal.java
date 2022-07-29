package ConversionPrograms;

import java.util.Scanner;

public class DecimalToOctal {
    //approach 1 : using the built-in method
    //approach 2: convert this decimal number to an octal number by continuously extracting the remainder
    // and dividing by 8.
    public static void main(String[] args) {
        //approach 1
        Scanner sc= new Scanner(System.in);
        int decimal = sc.nextInt();
        System.out.println("Decimal number "+decimal+" to Octal is: "+(Integer.toOctalString(decimal)));
        //approach 2
        int octalNumber=0, i=0;
        while(decimal!=0)
        {
            octalNumber +=(decimal%8)*((int)Math.pow(10,i++));
            decimal/=8;
        }
        System.out.println("Octal Number is:"+octalNumber);


    }
}
