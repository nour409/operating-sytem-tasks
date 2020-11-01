/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergsort;

import static mergsort.Mergsort.merge;

/**
 *
 * @author Nour
 */
public class mergthrid implements Runnable{
int []l;
int r;
    public mergthrid(int[] x,int y){
    this.l=x;
    this.r=y;
    }
    @Override
    public void run() {
       mergeSortfun(l,r);
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
    mergeSortfun(l, mid);
    mergeSortfun(r, n - mid);
 
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
