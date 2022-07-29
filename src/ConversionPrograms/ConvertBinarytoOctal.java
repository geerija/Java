package ConversionPrograms;
//Java Program to Convert Binary to Octal
// Approach 1:
//Using this approach, we first convert a binary number to an Integer and then using
// the toOctalString() built-in method of java convert it into a string of octal numbers.
// This string is then converted to an Integer again


public class ConvertBinarytoOctal {
    int binaryToDecimal(long binary)
    {
        int decimalNo =0, i=0;
        while (binary>0)
        {
            decimalNo+= Math.pow(2,i++)*(binary%10);
            binary/=10;

        }
        return decimalNo;

    }
    int decimalToOctal(long binary)
    {
        int decimalNo = binaryToDecimal(binary);
        String octal = Integer.toOctalString(decimalNo);
        int octalNo = Integer.parseInt(octal);
        return octalNo;


    }
    public static void main(String[] args) {
        // instantiating the class
        ConvertBinarytoOctal obj = new ConvertBinarytoOctal();

        System.out.println("Octal Number : "+obj.decimalToOctal(100100));

    }
}
