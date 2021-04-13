package com.application.frq.Dhruv;
import java.util.Arrays;

public class Insertion {
    public void Insertion(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int value = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > value) {
                nums[j + 1] = nums[j];
                j = j - 1;
            }
            nums[j + 1] = value;
        }
    }

    public static void main(String args[]) {
        Insertion test = new Insertion();
        int nums[] = {5,6,2,89,123,74};
        test.Insertion(nums);
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(nums));
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(nums));

    }
}
