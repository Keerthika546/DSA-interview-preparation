// Problem: LeetCode #217 - Contains Duplicate
// Pattern: HashSet
// Difficulty: Easy
// Time Complexity: O(n) - single pass through array
// Space Complexity: O(n) - HashSet stores up to n elements
//
// Approach:
// Store each element in HashSet while iterating.
// If element already exists in HashSet - duplicate found, return true.
// If loop completes with no match - all elements distinct, return false.
//
// Key Learning:
// Use HashSet when you only need to check existence.
// Use HashMap when you need to store index or value.
// HashSet replaced the inner loop of brute force O(n²) with O(1) lookup.
//
// Brute Force: O(n²) - nested loops checking every pair
// Optimized: O(n) - HashSet eliminates inner loop completely

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}

/*Interview Level Version
Problem:
"Given an integer array, return true if any element appears at least twice, return false if all elements are distinct."
Why HashSet:
"I chose HashSet over HashMap because I only need to check if an element exists — I do not need to store its index. HashSet gives me O(1) lookup with less memory overhead than HashMap."
How the code works:

Create an empty HashSet
Iterate through the array
For each element, check if it already exists in the HashSet
If yes → duplicate found, return true immediately
If no → store the element in HashSet for future iterations
If the loop completes with no duplicate found → return false

Time complexity: O(n) — single pass through the array
Space complexity: O(n) — HashSet can store up to n elements*/
