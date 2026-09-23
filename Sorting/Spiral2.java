public class Spiral2 {
    public static int Spiral(int matrix[][]){
         int sum=0;
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                // primary diagonal
                if(i==j){
                    sum+=matrix[i][j];
                }
                // secondary diagonal
                else if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
               }           
            }
         }
         return sum;
    }
    public static void  Search(int matrix[][]) {
        int count=0;
        for(int i=0;i<matrix.length;i++){
             for(int j=0;j<matrix[0].length;j++){
                 if(matrix[i][j]==3){
                   count++;
                 }
             }
        }
       
        System.out.println("number of times 3 apears is:"+count);
    }
    public static void printSum(int matrix[][]){
          int sum=0;
            for(int j=0;j<matrix[0].length;j++){
                 sum+=matrix[1][j];
             }
        System.out.println("sum is:"+sum);
    }
    public static void transpose(int matrix[][]){
        int row=matrix.length,col=matrix[0].length;
        int transpose[][]=new int[col][row];
        // transpose logic
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        // print the transpose matrix
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                 System.out.print(transpose[i][j] +" ");
            }
             System.out.println();
        }
      
    }
    public static void main(String args[]){
       int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    //    System.out.println(Spiral(matrix));
    //   Search(matrix);
        transpose(matrix);
    //   printSum(matrix);
    }
}
