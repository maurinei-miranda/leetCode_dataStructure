package day03;

import java.util.ArrayList;
import java.util.Arrays;

public class intersectionTwoArraysSolution {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};

        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> myArray = new ArrayList<>();
        int arr1Pos = 0;
        int arr2Pos = 0;

        while (arr1Pos < nums1.length && arr2Pos < nums2.length) {
            if (nums1[arr1Pos] == nums2[arr2Pos]) {
                myArray.add(nums1[arr1Pos]);
                arr1Pos++;
                arr2Pos++;
            } else if (nums1[arr1Pos] < nums2[arr2Pos]) {
                arr1Pos++;
            } else if (nums2[arr2Pos] < nums1[arr1Pos]) {
                arr2Pos++;
            }
        }

        int[] newArr = new int[myArray.size()];
        for (int i = 0; i < myArray.size(); i++) {
            newArr[i] = myArray.get(i);
        }

        return newArr;
    }
}