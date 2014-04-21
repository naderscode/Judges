/*
* KPurpose: This program prompts the user to enter eight judges' scores * from gymnastics * or diving competitions and then outputs the points received by the * * * contestant. 
* Written by Nader K, March 2012. */

import java.util.*;
import java.text.DecimalFormat;

    public class Judges
    { 
        public static void main(String[] args)
        {
            double maxScore = 0.0, minScore = 0.0, sumScore = 0.0,scoreAvg = 0.0, totalScore = 0.0 ;
            double[] num = new double[8];
            
            Scanner readinput = new Scanner(System.in);
            
            System.out.print("Enter 8 scores out of ten points separated by a space: ");
            
            for(int i=0;i<num.length;i++)
            {
                num[i] = readinput.nextDouble();
            
                sumScore = sumScore + num[i];
            }
            
            minScore = num[0];
            for(int j = 0;j< num.length; j++)
            {
                if( minScore > num[j])
                {
                    minScore = num[j];
                }
                
                if( maxScore < num[j])
                {
                    maxScore = num[j];
                }
            }
            
                    totalScore = sumScore - (maxScore + minScore);
                    
                    scoreAvg = totalScore / 6.0;
                    
                    System.out.println("Contestant Lowest score is " + minScore);
                    System.out.println("Contestant Highest score is " + maxScore);
                    System.out.println("Contestant Total score is " + totalScore);
                    
                    DecimalFormat fmt = new DecimalFormat("#.##");
                    System.out.println("Contestant average score is " + fmt.format(scoreAvg));
        }// end main
}// end class
    
