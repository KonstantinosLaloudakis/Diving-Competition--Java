/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askhsh.katadiseis;

import java.util.Scanner;

/**
 *
 * @author Loukas
 */
public class Judge {
    
    int id;
    
    
    Judge(int _id){
        id = _id;
    }
    
    public double divePoints(Dive d){
        double pts;
        Scanner s = new Scanner(System.in);
        boolean correct;
        do{
            pts = s.nextDouble();
            correct = d.setJudgePoints(id,pts);
        }while(!correct);
        return d.computeScore();
      
    }
    
    
}
