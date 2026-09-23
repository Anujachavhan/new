public class recurssion {
    public static void printdec(int n){
        if(n==1){
            System.out.println(n);
            return ;
        }
        System.out.print(n+" ");
        printdec(n-1);
       
       
    }
    public static void printinc(int n){
        if(n==1){
            System.out.print(n+" ");
            return ;
        }
          printinc(n-1);
        System.out.print(n+" ");
       }
    public static int fact(int n){
        // int fact=1;
        
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static int sum(int n){
      int sum=0;
      if(n==0){
        return n;
      }
      return n+sum(n-1);

    }
    public static int fib(int n){
         if(n==0||n==1){
            return n;
        }
      
        return fib(n-1)+fib(n-2);
    }
    public static boolean issorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return issorted(arr,i+1);
    }
    public static void main(String args[]){
        int n=10;
        int arr[]={1,3,4,11,7,8,9};
       printdec(4);
       printinc(5);
        System.out.println();
       System.out.println(fact(5));
       System.out.println(sum(5));
       System.out.println(fib(8));
       System.out.println(issorted(arr,1));
    }

}
