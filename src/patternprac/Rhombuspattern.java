package patternprac;
//   ****
//  ****
// ****
//****

public class Rhombuspattern {
    public static void main(String[] args) {
        int row =4;
        int col =4;
        //outer loop for rows
        for (int i=1;i<=row;i++)
        {
            //inner loop for the spaces
            for (int j=1;j<=row-i;j++)
            {
                System.out.print(" ");
            }
            //inner loop for the stars
            for (int j=1;j<=col;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
