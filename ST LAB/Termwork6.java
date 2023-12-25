import java.util.Arrays;


public class Termwork6
{
    public  static int binarysearch(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
public static void  main(String[] args){
    int[] arr={1,3,4,5,6,7};
    Arrays.sort(arr);
    int target=3;
   int index= binarysearch(arr,target);

    if(index!=-1){
        System.out.println("Found index "+index);
    }else{
        System.out.println("NOT found index");
    }
}
}
