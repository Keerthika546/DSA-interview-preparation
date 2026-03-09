/*
Problem: Remove Element

LeetCode Problem: #27 Remove Element
LeetCode Link: https://leetcode.com/problems/remove-element/

Pattern: Two Pointer
Difficulty: Easy

Example:
Input: nums = [3,2,2,3], val = 3
Output: 2

----------------------------------------------------

Brute Force Approach:

Shift all elements to the left whenever target is found.

Time Complexity: O(n²)
Space Complexity: O(1)

----------------------------------------------------

Optimal Approach:

Since order does not matter, replace the target element
with the last unchecked element and reduce the effective size.

Use:
i -> current index
n -> effective length of array

If nums[i] == val:
    nums[i] = nums[n - 1]
    n--
Do not increment i here because swapped element
must also be checked.

If nums[i] != val:
    increment i

Time Complexity: O(n)
Space Complexity: O(1)

----------------------------------------------------

Interview Explanation:

Since the problem does not require maintaining the original order,
I can optimize removal by replacing the target element with the
last unchecked element in the array.

This avoids shifting elements left, which would be costly.
After replacement, I do not move the pointer immediately because
the swapped element may also be equal to the target and must be checked again.

Instead of physically shrinking the array, I keep track of the valid portion of the array using the variable n. 
Each time I remove a target element, I replace it with the last unchecked element and reduce n. At the end, 
'n' represents the number of valid elements remaining.
*/

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;

        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                n--;
            } else {
                i++;
            }
        }

        return n;
    }
}
