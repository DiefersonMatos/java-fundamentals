package com.matos.exercises.two_sum;

import java.util.*;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution found");
    }

    public static Map<Integer, Integer> twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                map2.put(i, nums[i]);
                map2.put(map.get(complement), complement);
                return map2;
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution found");
    }

    public static void main(String[] args) {
        // Test case
        int[] nums = {13, 5, 7, 15, 2};
        int target = 9;

        int[] result = twoSum(nums, target);

        // Output result
        System.out.println("Index: " + Arrays.toString(result));
        System.out.println("Values: " + nums[result[0]] + " + " + nums[result[1]] + " = " + target);

        Map<Integer, Integer> resultMap = twoSum2(nums, target);
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(resultMap.entrySet());
        System.out.println("Index: " + resultMap.keySet());
        System.out.println("Values: " + entries.get(0).getValue() + " + " + entries.get(1).getValue() + " = " + target);
    }
}
