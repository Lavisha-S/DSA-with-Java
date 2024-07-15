import java.util.Arrays;

public class Bubblesort{
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1,0};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void bubble(int[] arr){
        //run the steps n-1 times
        boolean swapped;
        for(int i=0;i<arr.length;i++){
           swapped=false;
            //for each step,max item will come at last respective index
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                     swapped=true;
                }

            }
            if(!swapped){
                break;
            }
        }

    }
}