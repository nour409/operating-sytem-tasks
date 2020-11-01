/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergsort;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nour
 */
public class Mergsort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long startTime = System.nanoTime();
       int []a={5,3,2,4,1,4,5,66,9};
mergeSortfun(a,9);
for(int i=0;i<9;i++)
 System.out.println(a[i]);   
long endTime   = System.nanoTime();
long totalTime = endTime - startTime;
System.out.println(totalTime);


}
    private static void mergeSortfun(int[] a, int n) {
    if (n < 2) {
        return;
    }
    int mid = n / 2;
    int[] l = new int[mid];
    int[] r = new int[n - mid];
 
    for (int i = 0; i < mid; i++) {
        l[i] = a[i];
    }
    for (int i = mid; i < n; i++) {
        r[i - mid] = a[i];
    }
     List<Thread> threadList = new ArrayList<Thread>();
    mergthrid n1=new mergthrid(l, mid);
    mergthrid n2=new mergthrid(r, n - mid);
            Thread s=new Thread(n1);
            s.start();
            threadList.add(s);
            Thread s2=new Thread(n2);
            s2.start();
            threadList.add(s2);
 for(Thread t : threadList) {
        try {
            // waits for this thread to die
            t.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Mergsort.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
 
    merge(a, l, r, mid, n - mid);
}
    	public static void merge(
  int[] a, int[] l, int[] r, int left, int right) {
 
    int i = 0, j = 0, k = 0;
    while (i < left && j < right) {
        if (l[i] <= r[j]) {
            a[k++] = l[i++];
        }
        else {
            a[k++] = r[j++];
        }
    }
    while (i < left) {
        a[k++] = l[i++];
    }
    while (j < right) {
        a[k++] = r[j++];
    }
}

   
}