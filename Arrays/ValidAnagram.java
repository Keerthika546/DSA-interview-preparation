// Problem: LeetCode #242 - Valid Anagram
// Pattern: HashMap / int Array
// Difficulty: Easy
// Time Complexity: O(n) - single pass through both strings
// Space Complexity: O(1) - fixed size int array of 26 / O(n) HashMap
//
// Approach 1 - HashMap (my first solution):
// Store character counts of s in HashMap.
// For each character in t, check if it exists in HashMap with count > 0.
// If yes → decrement count.
// If no → return false.
// If all characters matched → return true.
//
// Approach 2 - Optimal int[26] (O(1) space):
// Create int array of size 26 (one slot per alphabet letter).
// In single loop — increment count for s, decrement count for t.
// After loop — if all values are zero → valid anagram.
// Uses ASCII math: 'c' - 'a' = 99 - 97 = 2 → maps directly to index 2.
//
// Brute Force: O(n²) - nested loops
// Approach 1: O(n) time O(n) space - HashMap
// Approach 2: O(n) time O(1) space - int[26] array (optimal)
//
// Key Learnings:
// 1. Characters have ASCII values — 'a'=97, 'b'=98, 'c'=99
// 2. char - 'a' converts any character to its alphabet index (0 to 25)
// 3. Use int[26] instead of HashMap when input is only lowercase letters
// 4. Increment for s + decrement for t in same loop = elegant balance check
// 5. Any non-zero value at end = character mismatch = not an anagram
// 6. Always check length first — different lengths = instant false

import java.util.HashMap;
//this is my solution, find the optimal solution below this code
class Solution {

    // Approach 1 — HashMap solution
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            if(map.containsKey(c) && map.get(c) > 0){
                map.put(c, map.get(c) - 1);
            } else {
                return false;
            }
        }

        return true;
    }
}

// Approach 2 — Optimal int[26] solution
// class Solution {
//     public boolean isAnagram(String s, String t) {
//
//         if(s.length() != t.length()) return false;
//
//         int[] count = new int[26];
//
//         for(int i = 0; i < s.length(); i++){
//             count[s.charAt(i) - 'a']++;
//             count[t.charAt(i) - 'a']--;
//         }
//
//         for(int c : count){
//             if(c != 0) return false;
//         }
//
//         return true;
//     }
// }
