class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n <= 2) return n;

        int ind = 2;
        for(int i = 2;i < n;i++){
            if(nums[i] != nums[ind - 2]){
                nums[ind] = nums[i];
                ind++;
            }
        }
        return ind;
    }
}
// Brute Force
// int n = nums.length;
//         if(n <= 2) return n;

//         int i = 2;
//         while(i < n){
//             if(nums[i] == nums[i-2]){
//                 for(int j = i;j < n-1;j++){
//                     nums[j] = nums[j+1];
//                 }
//                 n--;
//             }
//             else{
//                 i++;
//             }
//         }
//         return n;