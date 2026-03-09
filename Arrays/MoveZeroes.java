/*
Problem: Move Zeroes

Given an integer array nums, move all 0's to the end of it 
while maintaining the relative order of the non-zero elements.

LeetCode Problem: #283 Move Zeroes
LeetCode Link: https://leetcode.com/problems/move-zeroes/
Pattern: Two Pointer
Difficulty: Easy

Example:
Input:  [0,1,0,3,12]
Output: [1,3,12,0,0]

----------------------------------------------------

Brute Force Approach:

Create a new array.
Copy all non-zero elements.
Fill the remaining positions with zero.

Time Complexity: O(n)
Space Complexity: O(n)

----------------------------------------------------

Optimal Approach:

Use two pointers.

i -> position where the next non-zero element should go
j -> scanning pointer

Whenever nums[j] != 0:
swap nums[i] and nums[j]
increment i

Time Complexity: O(n)
Space Complexity: O(1)

----------------------------------------------------
----------------------------------------------------

Edge Cases:

1. All elements are zero → [0,0,0]
2. No zero elements → [1,2,3]
3. Single element array
4. Already arranged array

----------------------------------------------------
Interview Explanation:

Since we must maintain the order of non-zero elements and 
perform the operation in-place, I used the two-pointer pattern.

One pointer scans the array while the other pointer tracks the 
position where the next non-zero element should be placed.

Whenever a non-zero element is found, I swap it with the element 
at the placement pointer and move the placement pointer forward.

This ensures all non-zero elements are moved to the front while 
zeros naturally move to the end.
*/

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {

        int i = 0;

        for (int j = 0; j < nums.length; j++) {

            if (nums[j] != 0) {

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;

            }

        }

    }

}
