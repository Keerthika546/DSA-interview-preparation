/*
Problem: Remove Duplicates from Sorted Array
Pattern: Two Pointer

Brute Force:
Create a new array and store unique elements.

Time Complexity: O(n)
Space Complexity: O(n)

Optimal Approach:
Since the array is sorted, duplicates are adjacent.
Use two pointers:
- One pointer scans the array
- One pointer tracks the next unique position

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;

        int i = 1;

        for (int j = 1; j < nums.length; j++) {

            if (nums[j] != nums[j - 1]) {
                nums[i] = nums[j];
                i++;
            }

        }

        return i;
    }

}
