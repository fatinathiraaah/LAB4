
package l4q1;

import static java.lang.Math.pow;
import java.util.Scanner;


public class L4Q7 {  //DONEEEEEE!! THANKS AROFF, KAK YANA AND PIA HEHE
    
    public static void main(String[] args){
        
        Scanner s=new Scanner(System.in);
        double M; //monthly payment
        double C; //principal portion due
        double L; //interest due
        double R; //remaining principal balance due
        double n=1; //month under consideration
        double a,b;
        double totint=0; //total interest
                
        System.out.print("Enter principal amount: ");
        double P=s.nextDouble();
        System.out.print("Enter interest in %: ");
        double i=s.nextDouble();
        System.out.print("Enter total number of month(s): ");
        int N=s.nextInt();
        
         a=i/(12*100);
         b=1-(Math.pow((1+a),-N)); 
         M=(P*a)/b;
                                   
        System.out.println("Month\t\tMonthly Payment\t\tPrincipal\t\t"
                + "Interest\t\tUnpaid Balance\t\tTotal Interest");
        
        for(int j=1;j<=N;j++)
        {                      
            C=M*(Math.pow((1+a),-(1+N-n)));
            L=M-C;
            R=(L/a)-C;
            totint=+L;
            System.out.printf(j+"\t\t%.2f\t\t%.2f\t\t\t%.2f\t\t\t%.2f\t\t%.2f",M,C,L,R,totint);   
            System.out.println();
        n++;     
        }
        
               
    }
}
