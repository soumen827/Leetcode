class Solution {
    public int minBitFlips(int start, int goal) {
        int x = start ^ goal;
        int count =0;
        for(int i=0;i<=31;i++){ // number of 1 bit
            int mask = 1<<i;
            if((x & mask) != 0) count ++;
        }
        return count ;
    }
}