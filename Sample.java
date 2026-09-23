import java.util.*;
public class Sample {
    public static void printletters(String fullname){
         //   System.out.println(fullname.length()); 
         for(int i=0;i<fullname.length();i++){
          System.out.print(fullname.charAt(i)+" ");
         }
         System.out.println();
    }
    public static void concatenation(String firstname,String lastname){
       String fullname=firstname +""+lastname;
       System.out.println(fullname);
       System.out.println(fullname.charAt(1));
    }
     public static void main(String args[]){
      String firstname="tony ";
       String lastname="stark ";
       String fullname=firstname +""+lastname;
     //  concatenation(firstname,lastname);
     printletters(fullname);
     }
}
