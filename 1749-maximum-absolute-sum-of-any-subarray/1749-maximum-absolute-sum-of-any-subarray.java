class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;

        int currMax = 0, maxSum = Integer.MIN_VALUE;
        int currMin = 0, minSum = Integer.MAX_VALUE;

        for(int num : nums){

            currMax = Math.max(num, currMax + num);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(num, currMin + num);
            minSum = Math.min(minSum, currMin);
        }
        return Math.max(maxSum, Math.abs(minSum));
    }
}