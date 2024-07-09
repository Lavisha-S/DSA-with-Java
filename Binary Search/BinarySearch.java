public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-18,-12,-4,1,2,3,4,5,67,78};
        int target=5;
        int ans=binarySearch(arr, target);
        System.out.println(ans);
        
    }
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            //might possible start+end exceed the Integer limit
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;

            }
            else{
                return mid;
            }
        }
        return -1;
    }
    
}
