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
