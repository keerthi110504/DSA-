//spiral matrix
class spiralmatrix
{
    public static void print(int mat[][])
    {
        int m=mat.length;//row
        int n=mat[0].length;//column
        int srow=0;
        int erow=m-1;
        int scol=0;
        int ecol=n-1;
        while(srow<=erow && scol<=ecol)
        {
            for(int j=scol;j<=erow;j++)
            {
                System.out.print(mat[srow][j]);
            }
            for(int i=srow+1;i<=erow;i++)
            {
                System.out.print(mat[i][ecol]);
            }
            for(int j=ecol-1;j>=scol;j--)
            {
                System.out.print(mat[erow][j]);
            }
            for(int i=erow-1;i>=srow+1;i--)
            {
                System.out.print(mat[i][scol]);
            }
        srow++;
        scol++;
        erow--;
        ecol--;
        }
        System.out.println();
        
    }
    public static void main(String args[])
    {
        int mat[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        print(mat);
    }
}