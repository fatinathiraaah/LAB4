
package l4q1;

import java.util.Scanner;

public class L4Q2 {  //DONE
    
    public static void main(String[] args){
        
        Scanner s=new Scanner (System.in);
        int sum=0;
        System.out.print("Enter an integer: ");
        int num=s.nextInt();
        
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" + "+j);
                sum+=j;
              
            }
        }
         System.out.print(" = "+sum);
         System.out.println();
    }
}
