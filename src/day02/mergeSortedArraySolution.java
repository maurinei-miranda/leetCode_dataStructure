package day02;

import java.util.Arrays;

public class mergeSortedArraySolution {
    public static void main(String[] args) {
        int[] nm1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nm2 = new int[]{2, 5, 6};
        merge(nm1, 3, nm2, 3);

        int[] nm12 = new int[]{1};
        int[] nm22 = new int[]{};
        merge(nm12, 1, nm22, 0);

        int[] nm13 = new int[]{0};
        int[] nm23 = new int[]{1};
        merge(nm13, 0, nm23, 1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n > 0){
            System.arraycopy(nums2, 0, nums1, m,n);
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
