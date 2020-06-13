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
public class AskhshKatadiseis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DivingCompetition c1 = new DivingCompetition(5, 2, 3);
        c1.readAthleteNames();
        c1.runCompetition();
        
    }
    
}
