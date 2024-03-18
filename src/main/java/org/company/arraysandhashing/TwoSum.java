package org.company.arraysandhashing;

import java.util.HashMap;
import java.util.Map;

/*
 * Two solve the two sum problem, we need an array of numbers, and a target we set.
 * For example array such as {2, 7, 11, 15} and a target 9.
 * We instantiate a hash map to keep track of elements, important, key of map will be element, 
 * and value of map will be the position of element in the map.
 * We need to loop through the map, and calculate complement so that we subtract 9 - 2 in this case,
 * and check if we have the result 7 (complement), as a key anywhere in the map.
 * We do not have it in the map, so we save 2 as a key and position 0 in map as value, {2,0}.
 * Next element will be 7, and we repeat the process calculating complement, which will be 2 this time.
 * We see that we have 2 in map, using get() method, and we return the indices of those two elements,
 * in this case {0,1}. This solution beats 97.91% of users in Java on LeetCode.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> num_map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (num_map.containsKey(complement)) {
                return new int[] { num_map.get(complement), i };
            }
            num_map.put(nums[i], i);
        }
        throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
