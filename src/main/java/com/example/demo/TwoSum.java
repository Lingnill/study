package com.example.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lingnill
 */
public class TwoSum {
    public int[] twoSums(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (map.get(target-nums[i])==null){
                map.put(nums[i],i);
            }else {
                int[] a = new int[2];
                a[0]=map.get(target-nums[i]);
                a[1]=i;
                return a;
            }
        }
        return null;
    }
    public static void main(String[] args){
         TwoSum two = new TwoSum();
         int[] nums =new int[]{11,15,2,7};
         int target = 9;
         System.out.println(Arrays.toString(two.twoSums(nums,9)));
    }
}
