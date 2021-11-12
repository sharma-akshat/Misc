
class MatrixMultiplication
{
    static void printMatrix(int M[][],int rowSize,int colSize)
    {
        for(int i=0;i<rowSize;i++)
        {
            for(int j=0;j<colSize;j++)
            {
                System.out.print(M[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void multiplyMatrix(int row1,int col1,int row2,int col2,int A[][],int B[][])
    {
        System.out.println("Matrix A is: ");
        printMatrix(A,row1,col1);
        System.out.println("Matrix B is: ");
        printMatrix(B,row2,col2);
        int C[][]=new int[row1][col2];
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col2;j++)
            {
                for(int k=0;k<row2;k++)
                {
                    C[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        System.out.println("Resultant Matrix is: ");
        printMatrix(C,row1,col2);
    }
    public static void main(String gg[])
    {
        int row1=4, col1=4, row2=4, col2=4;
        int A[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        int B[][]={
            {10,20,30,40},
            {50,60,70,80},
            {90,100,110,120},
            {130,140,150,160}
        };
        multiplyMatrix(row1,col1,row2,col2,A,B);
    }


}