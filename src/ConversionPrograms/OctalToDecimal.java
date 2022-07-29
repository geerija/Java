package ConversionPrograms;

public class OctalToDecimal {
    public static void main(String[] args) {
        String onum = "157";

        // octal to decimal using Integer.parseInt()
        int num = Integer.parseInt(onum, 8);

        System.out.println(
                "Decimal equivalent of octal value "+onum+" is: "+ num);
    }
}
