package Leetcode;
import java.util.Arrays;
public class Problem414 {
    public  static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 1;

        int prev =nums[ nums.length -1];
        for(int i = nums.length-2; i>=0;i--){
            if(nums[i]!=prev){
                count++;
                prev = nums[i];
            }
            if(count== 3){
                return(nums[i]);
            }
        }
        return nums[nums.length-1];

    }

    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5};
        System.out.println(thirdMax(arr));
    }
}

