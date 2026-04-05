// Problem: LeetCode #49 - Group Anagrams
// Pattern: HashMap + Sorting / HashMap + int[26]
// Difficulty: Medium
// Time Complexity: O(n × k log k) — Approach 1 (sorting)
//                 O(n × k)        — Approach 2 (int[26]) optimal
// Space Complexity: O(n × k) — both approaches
//
// Approach 1 — Sorting (simpler):
// Sort each string alphabetically — all anagrams produce same sorted key.
// Use sorted string as HashMap key, list of original strings as value.
// "eat" → "aet", "tea" → "aet", "ate" → "aet" — all map to same key.
//
// Approach 2 — int[26] (optimal):
// Count character frequency using int array of size 26.
// Convert count array to String key using Arrays.toString().
// Eliminates sorting cost — O(n × k) instead of O(n × k log k).
// Uses ASCII math: 'c' - 'a' = 2 → maps directly to index 2.
//
// Key Learnings:
// 1. Two strings are anagrams if their sorted versions are equal
// 2. HashMap can store List as value — HashMap<String, List<String>>
// 3. Use computeIfAbsent to avoid local variable and map.put boilerplate
// 4. getOrDefault requires local variable to catch returned value
// 5. int[26] as key is faster than sorting but needs Arrays.toString()
//    because arrays cannot be used directly as HashMap keys in Java
// 6. Arrays cannot be HashMap keys — Java compares memory address not content
//    Always convert array to String when using as HashMap key

import java.util.*;

class GroupAnagrams {

    // Approach 1 — Sorting — O(n × k log k)
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            if(map.containsKey(key)){
                List<String> list = map.get(key);
                list.add(str);
                map.put(key, list);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
            }
        }

        return new ArrayList<>(map.values());
    }
}

// Approach 2 — int[26] optimal — O(n × k)
// class GroupAnagrams {
//     public List<List<String>> groupAnagrams(String[] strs) {
//
//         HashMap<String, List<String>> map = new HashMap<>();
//
//         for(String word : strs){
//             int[] count = new int[26];
//             for(char c : word.toCharArray()){
//                 count[c - 'a']++;
//             }
//             String key = Arrays.toString(count);
//             map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
//         }
//
//         return new ArrayList<>(map.values());
//     }
// }
