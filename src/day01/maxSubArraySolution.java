package day01;

public class maxSubArraySolution {
    public static void main(String[] args) {
        int[] myArr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(myArr));
        int[] myArr2= {1};
        System.out.println(maxSubArray(myArr2));
        int[] myArr3 = {5,4,-1,7,8};
        System.out.println(maxSubArray(myArr3));
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = 0;

        for (int num : nums) {

            currentSum = currentSum + num;
            maxSum = Math.max(currentSum, maxSum);
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
