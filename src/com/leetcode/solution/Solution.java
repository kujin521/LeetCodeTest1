package com.leetcode.solution;
//从排序数组中删除重复项
public class Solution {

    public static int removeDuplicates3(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int count = nums.length;
        int temp = nums[0];
        int i = 1;
        while (i < count) {
            if (nums[i] == temp) {
                for (int j = i; j < nums.length-1;j++){
                    nums[j] = nums[j+1];
                }
                count--;
            } else {
                temp = nums[i];
                i++;
            }
        }
        return count;
    }

    public static int removeDuplicates1(int[] nums) {
        if (nums.length==0) {
            return 0;
        }
        int number = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[number] != nums[i]) {
                number ++;
                nums[number] = nums[i];
            }
        }
        return (number + 1);
    }

    public static int removeDuplicates2(int[] nums) {
        int k = 0; //[0,k]中存放有序的不重复的元素
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[k]){
                nums[++k] = nums[i];
            }
        }
        return k+1;
    }
}
