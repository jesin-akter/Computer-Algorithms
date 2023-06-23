/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertion;

/**
 *
 * @author User
 */
public class Insertion {
public static void printarr(int arr[]){
for(int i=1; i<arr.length; i++){
int current = arr[i];
int j = i-1;
while(j>=0 && current < arr[j]){
arr[j+1]= arr[j];
j--;


}

arr[j+1]= current;

}





}
 
    
    
    
    public static void main(String[] args) {
        
        int arr[]={7,8,3,1,2};
        System.out.println("Data without insertion array:");
        for(int i:arr){
            System.out.println(i+"");
        }
        
        
        printarr(arr);
       System.out.println("Data After insertion array:");
        for(int i:arr){
            System.out.println(i+"");
        }
         
        
        
    }
    
}
