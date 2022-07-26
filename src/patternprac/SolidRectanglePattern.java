package patternprac;

public class SolidRectanglePattern {
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    public static void solid(int a, int b)
    {
        for (int i=1;i<=a;i++)
        {
            for (int j=1;j<=b;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int row = 4;
        int col = 5;
        solid(row,col);
    }
}
