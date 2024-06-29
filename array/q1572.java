package array;

public class q1572 {
    public static void main(String[] args) {
        int[][]matrix={
           {1,2,3},
           {4,5,6},
           {7,8,9}
          

        };
          int n=matrix.length;

          int result=diagonalsum(matrix, n);
          System.out.println(result);
         
    }
    static int diagonalsum(int[][]matrix,int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+matrix[i][i];
            sum=sum+matrix[i][n-1-i];}
            if(n%2!=0){
                sum=sum-matrix[1][1];   //[n-2][n-2]
            }
        
        return sum;
        
    }
    
}
