class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int total = 0;
        int tank = 0;

        for(int i = 0;i < gas.length;i++){
            int filled = gas[i] - cost[i];
            tank += filled;
            total += filled;

            if(tank < 0){
                start = i+1;
                tank = 0;
            }
        }
        return total >= 0? start : -1;
    }
}