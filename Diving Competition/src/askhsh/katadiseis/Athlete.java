/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askhsh.katadiseis;

/**
 *
 * @author Loukas
 */
public class Athlete implements Comparable<Athlete>{
    
    String name;
    double points;
    int divestodo = 0;
    Dive[] dives;
    int divesdone = 0;
    
    
    Athlete(String _name){
        name = _name;
        points = 0;
    }
    
    public void addDive(Dive dive){
        points += dive.computeScore();
        dives[divesdone] = dive;
        divesdone++;
    }
    
    public void setDives(int dtd){
        dives = new Dive[dtd];
        divestodo = dtd;
    }
    
    @Override
    public int compareTo(Athlete a){
        if(a.points < points)
            return -1;
        else if(a.points == points){
               return 0;
        }else
            return 1;
    }
    
}
