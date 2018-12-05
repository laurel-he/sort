package an.solution.com;

public class Solution {
	public static void main(String[] args) {
	    int[] nums = {2,7,8,9};
	    int target = 3;
	    int res;
	    res = searchInsert(nums,target);
	    System.out.println(res);
	}
	public static int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int i = 0;
        System.out.println(nums[0]);
        System.out.println(nums[len-1]);
        if(target < nums[0])
        {
            return 0;
        }
        if(target > nums[len-1])
        {
            return len;
        }
        
        for(i = 0; i < len; i++)
        {
            if(nums[i] == target)
            {
                return (int)i;
            }
            else
            {
                continue;
            }
        }
        int j = 0;
        for(j = 0; j <= len; j++)
        {
            if(target > nums[j] && target < nums[j+1])
            {
                return j+1;
            }
        }
        return 0;
    } 
}
