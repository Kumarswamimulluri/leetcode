class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int[] sorted = nums.clone();
        Arrays.sort(nums);
        
        int left = 0, right = n-1;
        while(left < right && nums[left] == sorted[left]){
            left++;
        }
        while(right > left && nums[right] == sorted[right]){
            right--;
        }
        if(left >= right){
            return 0;
        }
        return right - left + 1;
    }
}