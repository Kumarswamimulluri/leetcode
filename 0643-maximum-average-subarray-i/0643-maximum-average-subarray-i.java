class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        // First Window
        for(int i = 0;i < k;i++){
            sum += nums[i];
        }

        int maxSum = sum;
        // Slide window
        for(int i = k;i < nums.length;i++){
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum,sum);
        }
        return (double) maxSum / k;
    }
}