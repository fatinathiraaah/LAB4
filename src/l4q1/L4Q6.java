
package l4q1;

import java.util.Random;

public class L4Q6 {  //DONE
    
        public static void main(String[] args){
            Random r=new Random();
            int i=0;
            int num=r.nextInt();
            if(num>0){
            System.out.println(num);
           
        }
     while(num>0){
                num=num/10;
                i++;   
            }
                System.out.println("\nNumber of digits: "+i);
            }
}

