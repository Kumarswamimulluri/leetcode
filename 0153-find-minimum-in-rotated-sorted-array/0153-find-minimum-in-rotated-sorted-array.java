class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;

        int low = 0, high = n-1;

        while(low < high){
            int mid = (low + high) / 2;

            if(nums[mid] > nums[high]){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        return nums[low];
    }
}
// Tried Own 123 testcases passed
// int n = nums.length;
//         int min_val = Integer.MAX_VALUE;

//         int low = 0, high = n-1;

//         while(low <= high){
//             int mid = (low + high) / 2;

//             if(nums[mid] < min_val){
//                 min_val = nums[mid];
//             }
//             if(nums[mid] > nums[low] && nums[low] > nums[high]){
//                 low = mid + 1;
//             }
//             else{
//                 high = mid - 1;
//             }
//         }
//         return min_val;