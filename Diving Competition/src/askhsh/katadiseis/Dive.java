/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askhsh.katadiseis;

import java.util.Arrays;

/**
 *
 * @author Loukas
 */
public class Dive {
    
    double difficulty;
    double[] points;

    Dive(int numJudges){
        
        difficulty = 0;
        points = new double[numJudges];
        
    }
    
    public boolean setDifficulty(double diff){
        
        if(diff >= 1.2 && diff <= 3.6 && diff*100 == (int)(diff*100)){
            difficulty = diff;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean setJudgePoints(int judge, double pts){
        
        if(pts >= 0 && pts <= 10 && pts*2 == (int)pts*2){
            points[judge] = pts;
            return true;
        }else{
            return false;
        }
        
    }
    
    public double computeScore(){
        double[] temparray = points.clone();
        Arrays.sort(temparray);
        
        double sum = 0;
        if(points.length == 7){
            sum = points[2]+points[3]+points[4];
        }else if(points.length == 5){
            sum = points[1]+points[2]+points[3];
        }else{
            sum = points[0]+points[1]+points[2];
        }
        sum *= difficulty;
        
        sum = Math.round(sum * 100D) / 100D;
        
        return sum;
        
    }
    
    
    
    
    
}
