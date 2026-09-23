import java.util.*;
public class Stringopr{
public static boolean isPallinedrome(String str){
   
    for(int i=0;i<str.length();i++){
         int n=str.length();
        if(str.charAt(i)!=str.charAt(n-i-1)){
            return false;
        }
    }
   
    return true;
}


    public static void main(String[] args) {
        String str="anna";
       String str1="tony";
       String str2="tony";
       String str3=new String ("tony");
       if(str1==str2){
        System.out.println("Strings are equals");
       }
       else
        {
            System.out.println("String are not equals");
        } 
        if(str1==str3){
        System.out.println("Strings are equals");
       }
       else
        {
            System.out.println("String are not equals");
        } 
    //   for(int i=0;i<str.length();i++){
    //         System.out.print(str.charAt(i)+" ");
    //     }
    //       System.out.println();
    // System.out.println(isPallinedrome( str));

     }
}
