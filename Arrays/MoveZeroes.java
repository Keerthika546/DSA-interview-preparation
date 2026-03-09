/*
Problem: Move Zeroes
Pattern: Two Pointer

Brute Force:
Create a new array and copy all non-zero elements,
then fill remaining positions with zero.

Time Complexity: O(n)
Space Complexity: O(n)

Optimal Approach:
Use two pointers:
i → position where next non-zero element should go
j → scanning pointer

Whenever nums[j] != 0, swap nums[i] and nums[j]
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
