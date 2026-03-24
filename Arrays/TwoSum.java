// Pattern: Array + HashMap
// Time Complexity: O(n)
// Space Complexity: O(n)
// Approach: For each element, calculate complement = target - element.
//           Check if complement already exists in HashMap.
//           If yes, return both indexes. If no, store current element.

import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            
            map.put(nums[i], i);
        }
        
        return new int[]{};
    }
}

/*Problem:
"Given an array of integers and a target sum, find two numbers that add up to the target and return their indexes."
Approach:
"I will use a HashMap to store elements I have seen. For each element, I calculate the complement — the difference between the target and the current element. If the complement already exists in the HashMap, I have found my pair and return both indexes. If not, I store the current element with its index for future iterations."
Why HashMap:
"HashMap gives me O(1) lookup time. Instead of searching through the remaining elements repeatedly — which would be O(n²) — I can check if the complement exists instantly in the HashMap."
How the Code Works:

Create an empty HashMap
Iterate through each element in the array
Calculate complement = target - current element
Check if complement exists in HashMap
If yes → return the stored index and current index
If no → store the current element with its index in HashMap
The final return statement is just a Java requirement — it will never execute for valid input

Time Complexity: O(n) — single pass through the array
Space Complexity: O(n) — HashMap can store up to n elements*/
