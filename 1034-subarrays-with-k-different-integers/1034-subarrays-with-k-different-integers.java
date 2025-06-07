class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostSubarrays(nums,k) - atMostSubarrays(nums,k-1);
    }
    public static int atMostSubarrays(int[] nums,int k){
        int n = nums.length;
        int count = 0;
        int left = 0;

        Map<Integer,Integer> freq = new HashMap<>();
        for(int right = 0; right < n ;right++){
            int curr = nums[right];

            freq.put(curr,freq.getOrDefault(curr,0) + 1);

            if(freq.get(curr) == 1) k--;

            while(k < 0){
                int leftval = nums[left];
                freq.put(leftval,freq.get(leftval) - 1);
                if(freq.get(leftval) == 0){
                    k++;
                }
                left++;
            }
            count += right - left + 1;
        } 
        return count;
    }
}