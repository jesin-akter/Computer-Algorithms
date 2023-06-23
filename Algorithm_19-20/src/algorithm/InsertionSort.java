/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import java.util.*;

/**
 *
 * @author Student
 */
public class InsertionSort {
      Scanner s=new Scanner(System.in);
 public void insertionSort(){
   //array inserting 
     System.out.print("Enter the size of Array :~$ ");
     int sizeOfArray=s.nextInt();
     int [] arr= new int[sizeOfArray];
     //array Deleting
     for(int i=0; i<sizeOfArray;i++){
     arr[i]=s.nextInt();
     }
    //logic
     for(int i=1;i<sizeOfArray;++i){
         int flag=arr[i];
         int j=i-1;
          while(j>=0 && arr[j]>flag){
              arr[j+1]=arr[j];
              j=j-1;
     }
          arr[j+1]=flag;
          
          System.out.println("Pass "+ i+": ");
          for(int k=0;k<sizeOfArray;k++){
              System.out.print(arr[k]+ " ");
          } 
         System.out.println("");  
     }

 }

 }


 
