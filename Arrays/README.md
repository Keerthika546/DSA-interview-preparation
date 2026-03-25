# Arrays

This folder contains array-based interview problems solved in Java.

## Patterns Covered
- Two Pointers
- Sliding Window
- Prefix Sum
- Kadane's Algorithm
- HashMap + Array

## Problems

| # | Problem | LeetCode | Pattern | Difficulty | Time | Space |
|---|---|---|---|---|---|---|
| 1 | Remove Duplicates from Sorted Array | #26 | Two Pointers | Easy | O(n) | O(1) |
| 2 | Move Zeroes | #283 | Two Pointers | Easy | O(n) | O(1) |
| 3 | Remove Element | #27 | Two Pointers | Easy | O(n) | O(1) |
| 4 | Two Sum | #1 | HashMap + Array | Easy | O(n) | O(n) |
| 5 | Contains Duplicate | #217 | HashSet | Easy | O(n) | O(n) |

## Key Learnings
- When you need to search repeatedly inside an array, use HashMap to reduce O(n) to O(1)
- Two Pointers works best on sorted arrays
- Always think brute force first, then optimize
- Use HashSet when you only need existence check, use HashMap when you need to store index or value
