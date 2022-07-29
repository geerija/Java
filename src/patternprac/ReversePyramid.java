package patternprac;
//         ***********
//          *********
//           *******
//            *****
//             ***
//              *
//
public class ReversePyramid {
    public static void main(String[] args) {
        int row=6;
        for (int i=row;i>=1;i--)
        {
            for(int j=1;j<=row-i;j++)
            {
                //inner loop for spaces
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                //inner loop for columns
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
