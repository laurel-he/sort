import java.awt.print.Printable;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Maincalculate {
     
      public static void main(String[] args) {
          int[] nums = {2,7,11,15};
          int target = 13;
          int[] res;
          res = twoSum(nums,target);
          System.out.println(Arrays.toString(res));
      }
      
      public static int[] twoSum(int[] nums, int target) {
             int i;
             int j;
             int leng = nums.length;
             int[] res = new int[2];
             for(i = 0; i < leng; i++)
             {
                 for(j = (i+1); j < leng; j++ )
                 {
                     if(nums[i] + nums[j] == target)
                     {
                        res[0] = nums[i];
                        res[1] = nums[j];
                        break;
                     }
                 }
             }
             return res;
        }
    }