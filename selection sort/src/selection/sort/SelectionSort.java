
package selection.sort;


public class SelectionSort {
public static void printArr(int arr[]){
for(int i=0; i<arr.length - 1;i++){
    int smallest=i;
for(int j=i+1;j<arr.length ; j++){
if(arr[j]<arr[smallest]){

smallest =j;
}
}

int smallernum = arr[smallest];
arr[smallest]= arr[i];
arr[i]= smallernum;


}
}



    
    public static void main(String[] args) {
       int arr[] ={7,8,3,2,1};
        System.out.println("Before selection sort:");
        for( int i:arr  ){
            System.out.println(i+"");
        
        }
        System.out.println("");
        printArr(arr);
        System.out.println("After selectionsort:");
         for( int i:arr  ){
            System.out.println(i+" ");
        
        }
        
        
        
    }
}

   
