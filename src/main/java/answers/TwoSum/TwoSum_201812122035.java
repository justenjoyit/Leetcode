package answers.TwoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_201812122035 {
    public static void main(String args[]){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] answers = new Solution().twoSum(nums,target);
        System.out.printf("["+answers[0]+","+answers[1]+"]");
    }

    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] result = {0,0};
            Map<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<nums.length;++i){
                int sum = target-nums[i];
                if (null != map.get(sum)){
                    int j = map.get(sum);
                    if (i<j){
                        result[0]=i;
                        result[1]=j;
                    }else{
                        result[0] = j;
                        result[1] = i;
                    }
                    return result;
                }
                map.put(nums[i],i);
            }
            return result;
        }
    }
}
