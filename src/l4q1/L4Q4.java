
package l4q1;

import java.util.Scanner;


public class L4Q4 {  //SIAP BUT TAK JADI SANGAT! THANKS AROUF!
    
        public static void main(String[] args){
            
            Scanner s=new Scanner(System.in);
            /*LEAP YEAR
            -when divisible by 4 but not 100 (year%4==0 && year&100!==0)
            -also when divisble by 4,100 and 400 (year%4==0 && year&100==0 && year%400==0)
            
            NOT A LEAP YEAR
            -when not divisible by 4 (year%4!==0)
            -when divisible by 4 and 100 but not 400 (year%4==0 && year%100==0 && year%400!==0)
            */
            
            int year,a,b,c,totaldays;
                    
            System.out.print("Enter the year:");
            year=s.nextInt();
            
            a=year%4;
              
            if(a==0)
            {
                b=year%100;
                    if(b==0)
                    {
                        c=year%400;
                            if(c==0)
                            {
                                totaldays=366;
                            }
                            else
                            {
                                totaldays=365;
                            }
                    }
                    else
                    {
                        totaldays=366;
                    }
            }
            
            else
            {
                totaldays=365;
            }
                                  
            System.out.println("Enter the first day of the year [0=Sunday, 1=Monday, 2=Tuesday,"
                    + " 3=Wednesday, 4=Thursday, 5=Friday, 6=Saturday]:");
            int day=s.nextInt();
            
            System.out.println();
            System.out.println(year+" CALENDAR");
           
           
            //TO PRINT DAYS IN MONTH
            int day1,may=5,aug=8;
            
            for(int i=1;i<=aug;i++)
            {
                if(i==may)
                {
                    System.out.println("MAY"); 
                    System.out.println("Su\tMo\tTu\tWe\tTh\tFri\tSat\t");                  
                    for(int j=0;j<day;j++)
                    {
                        System.out.print("\t");//that space is a tab
                    }
                        for(int d=1;d<=31;d++)
                    {                       
                        System.out.printf(d+"\t");                        
                        day++;
                        day1=day%7;
                        if(day1==0)
                        {
                            System.out.println();
                        } 
                        
                    }
                    System.out.println();
                }
                
               
                
               if(i==aug)
               {
                   System.out.println("AUGUST"); 
                    System.out.println("Su\tMo\tTu\tWe\tTh\tFri\tSat");
                    for(int j=0;j<day;j++)
                    {
                        System.out.print("\t");//that space is a tab
                    }
                    for(int d=1;d<=31;d++)
                    {
                        System.out.print(d+"\t");
                        day++;
                        day1=day%7;
                        if(day1==0){
                            System.out.println();
                        } 
                        
                    } 
                    System.out.println();
               }
                
            }
               
               
            }
            
            }   

                    
        
   
