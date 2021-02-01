import java.util.Arrays;

public class Solution {
    public static int[] searchRange(int[] nums, int target) {
        int look = (int)Math.floor(nums.length/2.0);
        int iterations = 1;
        int[] thing = {0, 0};
        while(nums[look] != target || (look != 0 && nums[look-1] == target)){
            if(iterations > Math.log(nums.length/1.0) + 1){
                thing[0] =-1;
                thing[1] = -1;
                return thing;
            }
            else if(nums[look] > target || nums[look-1] == target){
                look = look/2;
            }
            else{
                look *= 1.5;
            }
            iterations++;
        }
        thing[0] = look;
        look = (int)Math.floor(nums.length/2.0);
        while(nums[look] != target || (look != nums.length - 1 && nums[look+1] == target)){
            if(nums[look] < target || nums[look+1] == target){
                look *= 1.5;
            }
            else{
                look = look/2;
            }
            iterations++;
        }
        thing[1] = look;
        return thing;
    }
    public static void main (String[] args){
        int[] thing = {0, 0, 3, 4, 4};
        System.out.println(Arrays.toString(searchRange(thing, 0)));
    }
}

