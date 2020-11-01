/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package greatingprogramruneer;
/**
 *
 * @author Nour
 */import java.lang.*;
import java.util.ArrayList;
import java.util.List;

public class Greatingprogramruneer {

    public static void main(String[] args) throws Exception {
         List<Thread> threadList = new ArrayList<Thread>();
        GreatingRinnable t1=new GreatingRinnable("hello");
        GreatingRinnable t2=new GreatingRinnable("GOOD");
        Thread s1=new Thread(t1);
        Thread s2=new Thread(t2);
        s1.start();
        threadList.add(s1);
        s2.start();
       threadList.add(s2);
       for(Thread t : threadList) {
          // waits for this thread to die
          t.join();
      }
            System.out.println("all are done");
    }
    
}
