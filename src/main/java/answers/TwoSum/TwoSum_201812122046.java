package answers.TwoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_201812122046 {
    public static void main(String args[]){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] answers = new TwoSum_201812122035.Solution().twoSum(nums,target);
        System.out.printf("["+answers[0]+","+answers[1]+"]");
    }

    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<nums.length;++i){
                int sum = target-nums[i];
                if (map.containsKey(sum)){
                    return new int[]{map.get(sum),i};
                }
                map.put(nums[i],i);
            }
            return null;
        }
    }
}

