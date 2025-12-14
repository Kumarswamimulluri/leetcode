class Solution {
    public void sortColors(int[] arr) {
        int count0 = 0, count1 = 0, count2 = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == 0) count0 += 1;
            else if(arr[i] == 1) count1 += 1;
            else count2 += 1;
        }
        int i = 0;
        while(count0 --> 0) arr[i++] = 0;
        while(count1 --> 0) arr[i++] = 1;
        while(count2 --> 0) arr[i++] = 2;
    }
}