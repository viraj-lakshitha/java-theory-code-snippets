package com.vitiya.interviewQ;

public class CheckListForOdd {

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,7,9,8,6};

        System.out.println(checkOddNum(nums));
    }

    public static boolean checkOddNum(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                return true;
            }
        }

        return false;
    }

}
