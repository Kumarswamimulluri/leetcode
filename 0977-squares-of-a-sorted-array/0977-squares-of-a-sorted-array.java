class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int left = 0, right = n-1;
        int ind = n-1;

        while(left <= right){
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if(leftSq > rightSq){
                res[ind] = leftSq;
                left++;
            }
            else{
                res[ind] = rightSq;
                right--;
            }
            ind--;
        }
        return res;
    }
}
