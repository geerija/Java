package patternprac;
//        1
//      2 1 2     
//    3 2 1 2 3    first number and last number same
//  4 3 2 1 2 3 4
//5 4 3 2 1 2 3 4 5

public class PalindromPyramid {
    public static void main(String[] args) {
        int row =5;
        for (int i=1;i<=row;i++)
        {
            //inner loop for spaces
            for (int j=1;j<=row-i;j++)
            {
                System.out.print(" ");
            }
            //inner loop for the printing the numbers in reverse
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);

            }
            //inner loop for printing the numbers after 1
            for (int j=2;j<=i;j++)
            {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
