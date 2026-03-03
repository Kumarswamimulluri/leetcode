class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        
        int currMax = nums[0];
        int currMin = nums[0];
        int globalMax = nums[0];

        for(int i = 1;i < n;i++){
            int tempMax = currMax;

            currMax = Math.max(nums[i],Math.max(nums[i] * currMax , nums[i] * currMin));
            currMin = Math.min(nums[i],Math.min(nums[i] * tempMax , nums[i] * currMin));

            globalMax = Math.max(globalMax,currMax);
        }
        return globalMax;
    }
}
// this will pass 70+ test cases
// int n = nums.length;
//         int product = nums[0];
//         int max_pro = 0;

//         for(int i = 1;i < n;i++){
//             if(product > 0){
//                 product *= nums[i];
//             }
//             else{
//                 product = nums[i];
//             }
//             if(product > max_pro){
//                 max_pro = product;
//             }
//         }
//         return max_pro;