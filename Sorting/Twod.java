import java.util.Scanner;
public class Twod {
    public static void print2D(int matrix[][]){
        int n=matrix.length,m=matrix[0].length;
         for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                 System.out.print( matrix[i][j]+ " ");
                }
                 System.out.println();
      }
    }
    public static boolean Search(int matrix[][],int key){
        int n=matrix.length,m=matrix[0].length;
        for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if( matrix[i][j]==key){
                        System.out.println("key is found at :" +i+" "+j);
                        return true;
                     }
                     
                }
         }
         System.out.println("key not found");
         return false;

    }
    public static int largest(int matrix[][]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]>largest){
                    largest=matrix[i][j];
                   
                }
            }
        }
        return largest;

    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int n=matrix.length,m=matrix[0].length;
        System.out.println("please enter the lements to be inserted:");
          Scanner sc=new Scanner(System.in);
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    matrix[i][j]=sc.nextInt();
                }
         }
               // output
            print2D(matrix);
           // Search(matrix,3);
          System.out.println("largest no among the mtarix is : "+ largest(matrix)) ;

             
   }
}
