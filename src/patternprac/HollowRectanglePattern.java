package patternprac;

public class HollowRectanglePattern {
//    * * * * * *
//    *         *
//    *         *
//    * * * * * *
    //first and last to print in full in between keep empty/hollow
    public static void Hollow(int n, int m)
    {
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                //matrix 
                if(i == 0 || i == n-1 || j == 0 || j == m-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }
    }
public static void main(String[] args) {
        int row = 5;
        int col =4;
        Hollow(row,col);

}
}
