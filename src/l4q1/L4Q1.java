
package l4q1;

import java.util.Scanner;

public class L4Q1 {  //DONE

    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int fact;
        System.out.print("Enter an integer: ");
        int num=s.nextInt();
        System.out.print("The factors are: ");
        
        for(int i=1;i<=num;i++){
            fact=num%i;
        if(fact==0){
            System.out.print(i+" ");
        }
           
        }
        System.out.println();
    }
    
}
