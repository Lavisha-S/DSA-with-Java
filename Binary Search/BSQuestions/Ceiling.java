public class Ceiling {
public static void main(String[] args) {
    int[] arr={2,4,5,6,7,8,11,13,14,16,17,18};
    int target=19;
    int ans=ceiling(arr,target);
    System.out.println(ans);
    
    
}
static int ceiling(int[] arr,int target){
    //if target no is greater than arr last
    if(target>arr[arr.length-1]){
        return -1;
    }
    int start=0;
    int end=arr.length-1;
    
    while(start<=end){
        int mid=start+(end-start)/2;
        if(target>arr[mid]){
            start=mid+1;
         }
         else if(target<arr[mid]){
            end=mid-1;
         }
        
         else{
            return arr[mid];
         }

    }
return arr[start];
}
}
