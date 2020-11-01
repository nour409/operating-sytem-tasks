/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplication;

/**
 *
 * @author Nour
 */
public class Multiplication {
private static final int size=3;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count=1;
        int [][]array= new int[size][size];
        int [][]array2=new int [size][size];
        int [][]answer=new int [size][size];
        for(int i=0;i<size;i++){
             for(int j=0;j<size;j++){
            array[i][j]=count;
            array2[i][j]=count;
            count++;
        } 
        }
         
        for(int row=0 ;row <size;row++){
            multirun n=new multirun(array,array2,answer,row);
            Thread s=new Thread(n);
            s.start();
      
        }
       for(int i=0;i<size;i++){
             for(int j=0;j<size;j++){
          System.out.print(answer[i][j]+" ");
          
        } System.out.println("");
        }
    }
    
}
