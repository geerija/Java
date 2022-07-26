package patternprac;
//*****
//****
//***
//**
//*

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        int row=5;
        for (int i=5;i>0;i--)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
