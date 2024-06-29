package array;

public class q1252 {
    public static void main(String[] args) {
        int m=2;
        int n=3;
        int matrix[][]=new int[m][n];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
           
                matrix[i][j]=0;
            }
    }
    int [][]indices={{0,1},{1,1}};
    int [][]incrementmatrix=increment(matrix,indices);
    for(int i=0;i<incrementmatrix.length;i++){
        for(int j=0;j<incrementmatrix[i].length;j++){
            System.out.println(incrementmatrix[i][j]+" ");

        }
        System.out.println();
    }
    int oddcell=nooffodd(incrementmatrix);
    System.out.println(oddcell);
}

static int nooffodd (int[][] incrementmatrix){
    int count =0;
    for(int i=0;i<incrementmatrix.length;i++){
        for(int j=0;j<incrementmatrix[i].length;j++){
            if (incrementmatrix[i][j]%2==0) {
count++;
                
            }
}
    }


return count;
}

public static int[][]increment(int[][]matrix,int[][]indices){
    int row=indices[i][0];
    int col=indices[j][1];

    for(int s=0;s<matrix[i].length;s++){
        matrix[row][s]++;
        for(int p=0;p<matrix.length;p++){
            matrix[p][col]++;
        }

    }
    return matrix;
}
}