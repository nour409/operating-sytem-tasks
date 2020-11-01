/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greatingprogramruneer;

import java.util.Date;

/**
 *
 * @author Nour
 */
public class GreatingRinnable implements Runnable  {
private static final int REPITAIONS=10;
private static final int DELY=1000;
private String greating;
public GreatingRinnable(String greating){
this.greating=greating;
}

    @Override
    public void run() {
        try{
            for(int i=0;i<REPITAIONS;i++){
            Date now=new Date();
            System.out.println(now +" "+greating );
            Thread.sleep(DELY);
            
            }   
        }catch(InterruptedException x){
            System.out.print(x);
        }
        
    
        }
 
    }
    
}
