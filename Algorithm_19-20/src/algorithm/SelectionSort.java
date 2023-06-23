/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import java.util.Scanner;

/**
 *
 * @author User
 */
class SelectionSort {
     Scanner s = new Scanner(System.in);
     public void selectionsort(int arr[]){
   //array inserting 
     System.out.print("Enter the size of Array :~$ ");
     int sizeOfArray=s.nextInt();
     int arry []= new int[sizeOfArray];
     //array Deleting
     for(int i=0; i<sizeOfArray;i++){
     arry[i]=s.nextInt();
     }
     
     //logic
     for(int i=0; i<arry.length-1;i++){
int smallest=i;
for(int j=i+1; j<arry.length; j++){
if(arry[i] <arry[smallest]){
smallest= j;

}
}
int smallernum= arry[smallest];
arry[smallest]= arry[i];
arry[i]= smallernum;

          
         
          System.out.println("After selection sort:");
        for(int i: arr){
            System.out.println(i+ "");
        
        }
    }


}

    
   

    

    
     
     
}

     
     


