package com.leetcode;

import com.leetcode.solution.Solution;
import org.junit.Test;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    @Test
    public void Test1(){
        int[] nums={1,1,2};
        long startTime=System.nanoTime(); //获取开始时间
        int len=Solution.removeDuplicates3(nums);
        long endTime=System.nanoTime(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime-startTime)/1000+"微秒");

        for (int i = 0; i <len; i++) {
            System.out.println(nums[i]);
        }
    }
}
