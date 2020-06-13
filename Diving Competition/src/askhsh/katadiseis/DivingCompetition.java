/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askhsh.katadiseis;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Loukas
 */
public class DivingCompetition {
    
    int numofAthletes;
    int numofDives;
    int numofJudges;
    
    Athlete[] order;
    Athlete[] position;
    Judge[] judges;
    
    DivingCompetition(int numAthletes, int numDives, int numJudges){
        
        Scanner s = new Scanner(System.in);
        
        numofAthletes = numAthletes;
        numofDives = numDives;
        numofJudges = numJudges;
        int i;
        
        order = new Athlete[numAthletes];
        position = new Athlete[numAthletes];
        judges = new Judge[numJudges];
        for(i = 0; i < numJudges; i++){
            judges[i] = new Judge(i);
        }
        
        
    }
    
    public void readAthleteNames(){
        int i;
        Scanner s = new Scanner(System.in);
        for(i = 0; i < numofAthletes; i++){
            System.out.printf("Give the name of athlete #%d:",i+1);
            String tempname = s.nextLine();
            order[i] = new Athlete(tempname);
            order[i].setDives(numofDives);
        }
        
        
        position = order.clone();
    }
    
    private void showPositions(){
        Arrays.sort(position);
        
        int i;
        for(i = 0; i < position.length; i++){
            System.out.printf("\n");
            System.out.printf("#%d: %s - %f\n",i+1,position[i].name,position[i].points);
        }
    }
    
    public void runCompetition(){
        
        int i,j,k;
        
        for(i = 0; i < numofDives; i++){
            //For every round
            
            for(j = 0 ; j < numofAthletes; j++){
                
                Dive currdive = new Dive(numofJudges);
                Scanner s = new Scanner(System.in);
                double diff;
                do{
                    System.out.printf("Enter the difficulty for the #%d dive of %s:",i+1,order[j].name);
                    diff = s.nextDouble();
                }while(!currdive.setDifficulty(diff));
                
                //After the dive is preformed
                //Every judge will judge it
                System.out.printf("The dive was preformed, now time to judge it:\n");
               
                for(k = 0; k < numofJudges; k++){
                    System.out.printf("What does judge #%d think?\n",k+1);
                    judges[k].divePoints(currdive);
                }
                
                //And the dive will be added to the athlete
                order[j].addDive(currdive);
                
                System.out.printf("And there is the contester table so far.");
                showPositions();
                
                
            }
            
            System.out.printf("Round %d has ended",i+1);
            
            
        }
        
        
        
    }
    
}
