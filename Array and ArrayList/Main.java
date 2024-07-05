import java.util.Arrays;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    //program for input the array
    Scanner in=new Scanner(System.in);
int[] arr =new int[5];
for(int i=0; i<arr.length ;i++){
arr[i]=in.nextInt();

}
for(int i=0; i<arr.length ;i++){
    System.out.print(arr[i]+" ");
    
    }
//enhanced for loop
for(int num:arr){
    System.out.print(num+" ");//for each loop

}
//by Arrays.toString(arr)
System.out.println(Arrays.toString(arr));

}

    
}
