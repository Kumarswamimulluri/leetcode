class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int n = nums2.length;

        for(int i = n-1;i >= 0;i--){
            int curr = nums2[i];
            while(!stack.isEmpty() && stack.peek() <= curr){
                stack.pop();
            }

            map.put(curr,stack.isEmpty() ? -1 : stack.peek());
            stack.push(curr);
        }
        int[] res = new int[nums1.length];
        for(int i = 0;i < nums1.length;i++){
            res[i] = map.get(nums1[i]);
        }
        return res;
    }
}