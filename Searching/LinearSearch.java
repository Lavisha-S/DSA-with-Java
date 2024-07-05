public class LinearSearch{
    public static void main(String[] args) {
        int[] nums={20,67,2,5,7,3,9,12,65,78,3};
        int target=65;
        boolean ans=linearSearch2(nums,target);
        System.out.println(ans);

    }
    static int linearSearch(int[] arr,int tar){
        if(arr.length==0){
            return -1;


        }
        for(int index=0;index<arr.length;index++){
            int element=arr[index];
            if(element==tar){
                return index;
            }
        }
        //no above line executed so element not found
        return -1;



    }
    static boolean linearSearch2(int[] arr ,int target){
        if(arr.length==0){
            return false;

        }
        for(int element:arr){
            if(element==target){

                return true;
            }
        }
        return false;

    }
}