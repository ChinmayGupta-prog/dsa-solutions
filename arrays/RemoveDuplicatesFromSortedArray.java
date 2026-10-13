/*
 * LeetCode 26: Remove Duplicates from Sorted Array
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 *
 * Approach: Two pointers.
 * j scans the array, while i tracks the last unique element.
 * When a different value is found, place it at the next unique position.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int i = 0;

        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                nums[++i] = nums[j];
            }
        }

        return i + 1;
    }
}
