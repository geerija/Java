package patternprac;
//    1
//   2 2
//  3 3 3
// 4 4 4 4
//5 5 5 5 5

public class FullPyramidWithNumber {
    public static void main(String[] args) {
        int row =5;
        for (int i= 1;i<=row;i++)
        {
            for (int j=1;j<=row-i;j++)
            {
                //inner loop 1 for printing the spaces
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                //inner loop 2 for printing the numbers
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
