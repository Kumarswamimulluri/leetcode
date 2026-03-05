class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;

        int left = 0,right = n-1;

        for(int i = 0;i < n;i++){
            int mid = (left + right) / 2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                left++;
            }
            else{
                right--;
            }
        }
        return -1;

    }
}