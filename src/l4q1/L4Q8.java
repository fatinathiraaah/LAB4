
package l4q1;

import java.util.Random;


public class L4Q8 
{
     public static void main(String[] args)
     {
        //PRIME NUMBER IS NUMBERS THAT IS DIVISIBLE BY ITSELF ONLY AND NUMBER 1
        //IF IT DIVIDES OTHER NUMBER GETS DECIMAL VALUE AND WE DONT WANT THAT. 
        //i/
         Random r=new Random();
         
         int num=r.nextInt(100);         
         System.out.println("the number is "+num);
         
         int a=1; //act as counter to cukupkan num prime numbers
         int b=2; //numbers yang ada possiblity jadi prime number
         //a++; should letak to statement yg that nombor is prime number
         while(a<=num)
         {
             {
                 if(b == 2 || b == 3 || b == 5 || b == 7)
                {
                System.out.println(b);
                a++;
                }
            else{
                if(b!=1 && b%2!=0 && b%3!=0 && b%5!=0 && b%7!=0)  //this part ni tak pernah tahu huwaaa!!
                {
                    System.out.println(b);
                    a++;
                }
                 }
             }b++;
         }
     }
}

