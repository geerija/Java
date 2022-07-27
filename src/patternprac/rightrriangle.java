package patternprac;
//---*          ---empty spaces
//--**
//-***
//****

public class rightrriangle {
    public static void triright(int row)
    {
        //outer loop for printing the rows
        for (int i=1;i<=row;i++)
        {

            for (int j=1;j<=row-i;j++)
            {
                //inner loop 1 for printing the spaces
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                //inner loop 2 for printing the columns---
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int row =5;
        triright(row);
    }
}
