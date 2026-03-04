class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;

        int total = 0;
        int currMax = 0, maxSum = Integer.MIN_VALUE;
        int currMin = 0, minSum = Integer.MAX_VALUE;

        for(int num : nums){
            total += num;

            currMax = Math.max(num,currMax + num);
            maxSum = Math.max(maxSum,currMax);

            currMin = Math.min(num,currMin + num);
            minSum = Math.min(minSum,currMin);
        }

        if(maxSum < 0) return maxSum;

        return Math.max(maxSum,total - minSum);
    }
}
// Brute Force
// int n = nums.length;
//         int max_sum = Integer.MIN_VALUE;

//         for(int i = 0;i < n;i++){
            
//             int sum = 0;

//             for(int j = 0;j < n;j++){
//                 sum += nums[(i + j) % n];

//                 max_sum = Math.max(max_sum, sum);
//             }
//         }
//         return max_sum;