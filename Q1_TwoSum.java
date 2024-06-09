import java.util.*;

public class Q1_TwoSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            int more = target - a;
            if (map.containsKey(more)) {
                return new int[]{map.get(more), i};
            }
            map.put(a, i);
        }
        // return an empty array or throw an exception if no solution is found
        return new int[]{};
    }
}
