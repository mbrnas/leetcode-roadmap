package org.company.arraysandhashing;

import java.util.HashSet;

/*
 * To solve this problem in O(n) time, we will use HashSet.
 * The return type of method will be boolean, as per LeetCode question request.
 * We declare a "box" a HashSet to hold elements of Integer type.
 * We will use enhanced for loop through the set and see if box contains the num.
 * If box contains num, return true, else add the element to the box.
 * Below is a main method to test the static containsDuplicate() method.
 */
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> box = new HashSet<Integer>();
        for (int num : nums) {
            if (box.contains(num))
                return true;
            box.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 1, 2, 3, 5 };
        System.out.println(containsDuplicate(numbers));
    }
}
