/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithm;

/**
 *
 * @author Kenneth R. Kutschera
 */
public class SortingAlgorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This program creates a sorting algorithm application.");
        System.out.println("Our array has 15 elements with random numbers.");
        
        int array[] = {23, 45, 22, 100, 29213, 3453, 123, 453, 2356, 323, 632, 324, 2356, 668, 544};
        
        System.out.println("This is the contents of our array.");
        for (int i = 0; i < array.length; i++){
            
            System.out.print(array[i] + " ");
        }
        
        System.out.println("\nNow we will use the sorting algorithm to put them in order.");
        
        sortingAlgorithm(array);
        
        System.out.println("This is the contents of our array.");
        for (int i = 0; i < array.length; i++){
            
            System.out.print(array[i] + " ");
        }
    }
    
    public static void sortingAlgorithm(int[] array){
        
        int startScan, index, minIndex, minValue;
        
        for (startScan = 0; startScan < (array.length - 1); startScan++){
            
            minIndex = startScan;
            minValue = array[startScan];
            for(index = startScan + 1; index < array.length; index++){
                
                if (array[index] < minValue){
                    
                    minValue = array[index];
                    minIndex = index;
                }                
            }
            array[minIndex] = array[startScan];
            array[startScan] = minValue; 
        }
        
    }
    
}
