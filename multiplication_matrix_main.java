/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplication;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nour
 */

public class multirun implements Runnable {
int row;
int [][]answer;
int[][] array1;
int[][] array2;
    public multirun(int[][] array1,int [][]array2,int [][]answer,int row){
     this.array1=array1;
     this.array2=array2;
     this.answer=answer;
        this.row=row;
      
    }
    @Override
    public void run() {
        try {
               for(int col=0;col<3;col++){
         answer[row][col]=array1[row][col]*array2[row][col];
        }
            Thread.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(multirun.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
    
}
