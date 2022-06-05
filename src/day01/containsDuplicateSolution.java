package day01;

import java.util.HashSet;

public class containsDuplicateSolution {
    public static void main(String[] args) {
        //testCases
        int[] myArr = {1, 2, 3, 1};
        System.out.println(containsDuplicated(myArr)); //Expected - true
        int[] myArr2 = {1, 2, 3, 4};
        System.out.println(containsDuplicated(myArr2)); // Expected - false
        int[] myArr3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicated(myArr3)); //Expected - true
    }

    public static boolean containsDuplicated(int[] nums) {
        HashSet arrayList = new HashSet();
        for (int num : nums) {
            if (arrayList.contains(num)) {
                return true;
            } else {
                arrayList.add(num);
            }
        }
        return false;
    }
}



