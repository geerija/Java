package patternprac;
//12345
//1234
//123
//12
//1

public class InvertedPyramidWithNumbers {
    public static void main(String[] args) {
        int row=5;
        for (int i=row;i>0;i--)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
