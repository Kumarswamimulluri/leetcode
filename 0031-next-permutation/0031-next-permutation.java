class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1;

        // finding the decreasing ele from the end
        for(int i = n-2;i >= 0;i--){
            if(nums[i] < nums[i+1]){
                ind = i;
                break; // it will break at the first decreasing point it will not going to                     // check for another
            }
        }
        // if there is no decresing ele then it will be last permtation simply reverse that
        if(ind == -1){
            reverse(nums,0,n-1);
            return;
        }
        // find the permutaion ele just larger than the nums[ind] just swap them
        for(int i = n-1;i >=0;i--){
            if(nums[i] > nums[ind]){
                swap(nums,i,ind);
                break;
            }
        }
        // Reverse the part after index `ind` to get next smallest order
        // reverse(nums,ind+1,n-1);
    }
    private void reverse(int[] nums,int start,int end){
        while(start < end){
            swap(nums,start++,end--);
        }
    }
    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

// Intution :
// Step 1: Find the first decreasing element from the end
// Step 2: // if there is no decresing ele then it will be last permtation simply reverse that
// Step 3:  find the permutaion ele just larger than the nums[ind] just swap them
// fill the remianing as small as possible
// try to fill the remaining in a sorted way