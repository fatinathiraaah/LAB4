
package l4q1;

import java.util.Scanner;


public class L4Q3 { //DONEEEEEEEEEE GOOD JOB!!
    
    public static void main(String[] args){
        
        Scanner s=new Scanner(System.in);
        double std=0,avg=0;
        int sum=0,score,a=0,sumsq=0,scoresq,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        
        
        for(int i=0;i<=a;i++){            
        System.out.print("Enter a score [negative score to quit]:");
        score=s.nextInt();
        
        if(score>=0){
            a++;
            sum+=score;
            avg=sum/a;//calculate average
               if(min>score){
                  min=score;
               }
               if(max<score){
                   max=score;
               }  
            scoresq=score*score;
            sumsq+=scoresq;                                        
        }
        else { //in else is to print all infos 
            //MINIMUM SCORE          
            System.out.println("Minimum score:"+min);
            //MAXIMUM SCORE
            System.out.println("Maximum score:"+max);
            //SUM OF SCORES
            //System.out.println("sum scores:"+sum);
            //AVERAGE SCORE
            System.out.println("Average score:"+avg);
            //STANDARD DEVIATION 
            //System.out.println("sumsq:"+sumsq);
            std=Math.sqrt((sumsq-((sum*sum)/a))/(a-1)); 
            System.out.printf("Standard deviation:"+"%.2f",std);
        break;
        }        
      } 
        System.out.println();   
    }    
   }
    

