// LeetCode Problem 75: Sort Colors
// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
// We will use the integers 0, 1, and 2 to represent the colors red, white, and blue, respectively.
// You must solve this problem without using the library's sort function.

// Example 1:
// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]

// Example 2:
// Input: nums = [2,0,1]
// Output: [0,1,2]

// Example 3:
// Input: nums = [0]
// Output: [0]

// Example 4:
// Input: nums = [1]
// Output: [1]

// Constraints:
// n == nums.length
// 1 <= n <= 300
// nums[i] is 0, 1, or 2.

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int st = 0;
        int end = n-1;

        for(int i = 0;i < n;i++)
        {
            while(nums[i] == 2 && end > i)
            {
                swap(nums, i, end);
                end--;
            }
            while(nums[i] == 0 &&  st < i)
            {
                swap(nums, i, st);
                st++;
            }
        }
    }
     private void swap(int[] nums, int idx1, int idx2)
    {

        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }
}