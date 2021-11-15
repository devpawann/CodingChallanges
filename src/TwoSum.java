//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.


import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] myArr = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(myArr, 9)));

    }

    public static int[] twoSum(int[] num, int target) {
        HashMap<Integer, Integer> myHashMap = new HashMap<>();

        for (int i =0;i<num.length;i++) {
            myHashMap.put(num[i], i);
        }

        for (int i = 0; i < num.length; i++) {
            int diff = target - num[i];
            if (myHashMap.containsKey(diff)) {
                int reqIndex = myHashMap.get(diff);
                if (reqIndex != i) {
                    return new int[]{i, reqIndex};
                }
            }
        }
        return new int[]{};
    }
}
