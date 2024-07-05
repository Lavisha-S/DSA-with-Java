import java.util.Arrays;
import java.util.Scanner;
public class MultiDimensional {
public static void main(String[] args) {
    /* int[][] arr=new int[3][3]; */
   /*  int[][] arr={{1,2,3,},{1,2,3,},{1,2,3}};
     */
    Scanner in=new Scanner(System.in);
    int[][] arr=new int[3][2];
    System.out.println(arr.length);
    //input
    for(int row=0;row<arr.length;row++){
        for(int col=0;col<arr[row].length;col++){
            arr[row][col]=in.nextInt();
        }
        
    }
    //output
    /* for(int row=0;row<arr.length;row++){
        for(int col=0;col<arr[row].length;col++){
            System.out.print(arr[row][col]+" ");
        }
        System.out.println();
    } */

   /*  for(int row=0;row<arr.length;row++){
        System.out.println(Arrays.toString(arr[row]));
    } 
 */
for(int[] a:arr){
    System.out.println(Arrays.toString(a));
}





}
}
   /* 
import java.util.Arrays;

public class Swap {
    
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,6,7};
        //swap(arr,0,8);
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr,int index 1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            //swap
            swap(arr,start,end);
            start++;
            end--;

        }
    }

}
 */ 

